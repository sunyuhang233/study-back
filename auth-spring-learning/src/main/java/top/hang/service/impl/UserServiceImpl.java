package top.hang.service.impl;


import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import top.hang.common.Common;
import top.hang.entity.User;
import top.hang.entity.UserLoginVo;
import top.hang.exception.CustomServiceException;
import top.hang.repository.UserRepository;
import top.hang.service.UserService;
import top.hang.util.JwtUtil;
import top.hang.util.MD5Util;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 21:46
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Resource
    private UserRepository userRepository;
    @Override
    public UserLoginVo login(String username, String password) {
        // 1.判断用户是否存在
        User user = userRepository.findUserByUsername(username);
        if (user == null) {
            throw new CustomServiceException(Common.ERROR_CODE, Common.USER_NOT_EXIST_MSG);
        }
        // 2.判断密码是否正确
        if (!user.getPassword().equals(MD5Util.inputPasToFromPass(password))) {
            throw new CustomServiceException(Common.ERROR_CODE, Common.LOGIN_ERROR_MSG2);
        }
        // 3.返回用户信息
        UserLoginVo userLoginVo = new UserLoginVo();
        BeanUtils.copyProperties(user, userLoginVo);
        // 4.生成token
        String token = JwtUtil.create(user.getId(), user.getUsername());
        userLoginVo.setToken(token);
        // 5.将用户信息存入redis
        redisTemplate.opsForValue().set("user", userLoginVo, 10, TimeUnit.SECONDS);
        return userLoginVo;
    }

    @Override
    public int register(User user) {
        // 1.判断用户是否存在
        User user1 = userRepository.findUserByUsername(user.getUsername());
        if(user1 != null){
            throw new CustomServiceException(Common.ERROR_CODE, Common.USER_EXIST_MSG);
        }
        // 2.密码加密
        user.setPassword(MD5Util.inputPasToFromPass(user.getPassword()));
        // 3.保存用户信息
        User user2 = userRepository.save(user);
        // 4.判断是否保存成功
        if(Objects.isNull(user2)){
            throw new CustomServiceException(Common.ERROR_CODE, Common.REGISTER_ERROR_MSG);
        }
        return user2.getId();
    }
}

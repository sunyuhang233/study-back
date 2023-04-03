package top.hang.intercepter;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import top.hang.common.Common;
import top.hang.entity.UserLoginVo;
import top.hang.exception.CustomServiceException;

import java.util.Objects;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 22:58
 */
@Component
public class MyIntercepter implements HandlerInterceptor {
    @Resource
    private RedisTemplate redisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 1.获取token
        String token = request.getHeader("Authorization");
        // 2.判断token是否为空
        if (token == null) {
            throw new CustomServiceException(Common.UN_LOGIN_TOKEN_CODE, Common.USER_NOT_LOGIN_MSG);
        }
        // 3.从redis中获取用户信息
        UserLoginVo userLoginVo = (UserLoginVo) redisTemplate.opsForValue().get("user");
        if (Objects.isNull(userLoginVo)) {
            throw new CustomServiceException(Common.UN_LOGIN_TOKEN_CODE, Common.LOGIN_ERROR_MSG);
        }
        // 4.判断token是否一致
        if (!token.equals(userLoginVo.getToken())) {
            throw new CustomServiceException(Common.UN_LOGIN_TOKEN_CODE, Common.UN_LOGIN_TOKEN);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}

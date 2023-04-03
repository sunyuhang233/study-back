package top.hang.auths;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.hang.common.Common;
import top.hang.entity.UserLoginVo;
import top.hang.exception.CustomServiceException;

import java.util.Objects;

/**
 * @author Ahang
 * @version 1.0
 * @description 自定义AOP注解
 * @date 2023/3/28 16:17
 * @Around注解：环绕通知，相当于MethodInterceptor 参数为@annotation(自定义注解的位置)
 * 方法中的参数ProceedingJoinPoint是必须的，如果没有这个参数，就不是环绕通知了
 */
@Aspect
@Component
public class AuthAspect {
    @Resource
    private RedisTemplate redisTemplate;

    @Around("@annotation(top.hang.auths.CheckAuth)")
    public Object checkAuth(ProceedingJoinPoint point) throws Throwable {
        HttpServletRequest request = getHttpServletRequest();
        // 获取token
        String token = request.getHeader("Authorization");
        // 判断token是否为空
        if (token == null) {
            throw new CustomServiceException(Common.UN_LOGIN_TOKEN_CODE, Common.USER_NOT_LOGIN_MSG);
        }
        // 从redis中获取用户信息
        UserLoginVo userLoginVo = (UserLoginVo) redisTemplate.opsForValue().get("user");
        if (Objects.isNull(userLoginVo)) {
            throw new CustomServiceException(Common.UN_LOGIN_TOKEN_CODE, Common.LOGIN_ERROR_MSG);
        }
        // 判断token是否正确
        if (!token.equals(userLoginVo.getToken())) {
            throw new CustomServiceException(Common.UN_LOGIN_TOKEN_CODE, Common.UN_LOGIN_TOKEN);
        }
        // 执行方法
        return point.proceed();
    }

    private HttpServletRequest getHttpServletRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes attributes = (ServletRequestAttributes) requestAttributes;
        assert attributes != null;
        return attributes.getRequest();
    }
}

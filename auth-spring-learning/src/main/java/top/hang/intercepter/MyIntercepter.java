package top.hang.intercepter;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import top.hang.common.Common;
import top.hang.entity.UserLoginVo;
import top.hang.exception.CustomServiceException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 22:58
 */
public class MyIntercepter implements HandlerInterceptor {
    @Resource
    private RedisTemplate redisTemplate;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("token");
        // 如果没有token
        if (token == null) {
          throw new CustomServiceException(Common.LOGIN_ERROR_CODE,"请先登录");
        }
        UserLoginVo userLoginVo = (UserLoginVo) redisTemplate.opsForValue().get("user");
        String userLoginVoToken = userLoginVo.getToken();
        // 判断token是否一致
        if (userLoginVoToken.equals(token)) {
            return true;
        }
        // 判断token是否过期
        if (!redisTemplate.hasKey(token)) {
            throw new CustomServiceException(Common.LOGIN_ERROR_CODE,"登录过期，请重新登录");
        }
        return false;
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

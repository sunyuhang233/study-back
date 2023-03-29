package top.hang.auth;

import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.hang.common.MyCustoms;
import top.hang.exception.CustomException;

import java.lang.reflect.Method;

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
    @Around("@annotation(top.hang.auth.CheckAuth)")
    public Object checkAuth(ProceedingJoinPoint point) throws Throwable {
        // 获取HttpServletRequest
        HttpServletRequest httpServletRequest = getHttpServletRequest();
        // 获取请求头中的token
        String token = httpServletRequest.getHeader("Authorization");
        if(token == null){
            throw new CustomException(MyCustoms.FILE_ERROR,MyCustoms.NO_LOGIN_MSG);
        }
        // 获取方法签名
        MethodSignature signature =(MethodSignature) point.getSignature();
        // 获取方法
        Method method = signature.getMethod();
        // 获取注解
        CheckAuth annotation = method.getAnnotation(CheckAuth.class);
        // 获取注解中的值
        String value = annotation.value();
        if(!value.equals(token)){
            throw new CustomException(MyCustoms.FILE_ERROR,MyCustoms.FILE_ERROR_MSG);
        }
        // 执行方法
        return point.proceed();
    }

    private HttpServletRequest getHttpServletRequest(){
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
       ServletRequestAttributes attributes= (ServletRequestAttributes) requestAttributes;
       assert attributes != null;
         return attributes.getRequest();
    }
}

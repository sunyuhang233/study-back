package top.hang.auths;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.hang.entity.Log;
import top.hang.repository.LogRepository;

import java.lang.reflect.Method;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/4/3 16:11
 */
@Aspect
@Component
public class LogAspect {
    @Resource
    private LogRepository logRepository;

    // 记录日志
    @Around("@annotation(top.hang.auths.MyLog)")
    public Object log(ProceedingJoinPoint point) throws Throwable {
        // 获取注解
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        MyLog myLog = method.getAnnotation(MyLog.class);
        // 获取请求信息
        HttpServletRequest request = getHttpServletRequest();
        String ip = request.getRemoteAddr();
        String url = request.getRequestURL().toString();
        String method1 = request.getMethod();
        String classMethod = point.getSignature().getDeclaringTypeName() + "." + point.getSignature().getName();
        // 获取参数
        Object[] args = point.getArgs();
        // 执行方法
        Object proceed = point.proceed();
        // 记录日志
        Log log = new Log();
        log.setIp(ip);
        log.setUrl(url);
        log.setMethod(method1);
        log.setClassname(classMethod);
        log.setMyLog(myLog.value());
        logRepository.save(log);
        return proceed;
    }

    private HttpServletRequest getHttpServletRequest() {
        RequestAttributes requestAttributes = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes attributes = (ServletRequestAttributes) requestAttributes;
        assert attributes != null;
        return attributes.getRequest();
    }
}

package top.hang.auths;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//记录日志的注解
@Retention(RetentionPolicy.RUNTIME)
public @interface MyLog {
    String value() default "";
}

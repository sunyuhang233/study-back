package top.hang.auths;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 自定义注解
 */
// @Retention 注解 用于描述注解的生命周期（即：被描述的注解在什么范围内有效）
@Retention(RetentionPolicy.RUNTIME)
public @interface CheckAuth {
}

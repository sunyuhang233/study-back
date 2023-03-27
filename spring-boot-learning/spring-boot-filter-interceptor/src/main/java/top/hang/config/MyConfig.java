package top.hang.config;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.hang.interceptor.AuthInterceptor;
import top.hang.interceptor.CustomInterceptor;

/**
 * @author Ahang
 * @version 1.0
 * @description 配置拦截器
 * @date 2023/3/27 16:01
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    private final String[] excludePathPatterns = {
            "/css/**",
            "/images/**",
            "/api/interceptor"
    };

    @Resource
    private AuthInterceptor authInterceptor;
    @Resource
    private CustomInterceptor customInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(authInterceptor).addPathPatterns("/**").excludePathPatterns(excludePathPatterns);
        registry.addInterceptor(customInterceptor)
                .addPathPatterns("/**").
                excludePathPatterns( excludePathPatterns);
        // 自定义拦截器 第一个参数 是自定义拦截器的实例 第二个参数是拦截器的拦截路径 第三个参数是拦截器的排除路径
    }
}

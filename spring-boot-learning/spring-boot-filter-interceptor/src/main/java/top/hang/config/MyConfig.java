package top.hang.config;

import jakarta.annotation.Resource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import top.hang.interceptor.AuthInterceptor;
import top.hang.interceptor.CustomInterceptor;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
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
                excludePathPatterns( excludePathPatterns)
        ;
    }
}

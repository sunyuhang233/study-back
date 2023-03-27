package top.hang.config;

import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahang
 * @version 1.0
 * @description 分页插件配置
 * @date 2023/3/22 23:01
 */
@Configuration
public class MybatisPlusConfiguration {
    //配置分页拦截器
    @Bean
    public PaginationInnerInterceptor paginationInterceptor() {
        return new PaginationInnerInterceptor();
    }
}
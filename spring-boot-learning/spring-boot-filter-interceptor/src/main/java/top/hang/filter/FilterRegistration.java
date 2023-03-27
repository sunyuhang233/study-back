package top.hang.filter;

import jakarta.servlet.Filter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahang
 * @version 1.0
 * @description 过滤器的配置类注册
 * 实现步骤为：
 * 1.创建一个配置类
 * 2.创建一个过滤器类
 * 3.在配置类中创建一个FilterRegistrationBean对象
 * 4.设置过滤器对象
 * 5.设置拦截路径
 * 6.设置优先级
 * 7.在启动类上添加注解@ServletComponentScan
 * 注意：需要给定一个泛型 ？ 代表任意类型
 * @date 2023/3/27 14:52
 */
@Configuration
public class FilterRegistration {
//    @Bean
//    public FilterRegistrationBean<?> filterRegistrationBean(){
//        FilterRegistrationBean<CustomFilter> filterRegistrationBean = new FilterRegistrationBean<>();
//        filterRegistrationBean.setFilter(new CustomFilter());
//        // 设置拦截路径
//        filterRegistrationBean.addUrlPatterns("/*");
//        // 设置优先级
//        filterRegistrationBean.setOrder(10);
//        return  filterRegistrationBean;
//    }
}

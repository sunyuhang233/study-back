package top.hang.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @author Ahang
 * @version 1.0
 * @description TODO
 * @date 2023/3/27 14:50
 */
@WebFilter(urlPatterns = "/*")
@Slf4j
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("自定义过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("之前执行过滤器");
        // filterChain.doFilter()方法执行后才会执行过滤器之后的代码
        filterChain.doFilter(servletRequest, servletResponse);
        log.info("之后执行过滤器");
    }

    @Override
    public void destroy() {
      log.info("自定义过滤器销毁");
    }
}

package top.hang.listener;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Ahang
 * @version 1.0
 * @description 监听器 用于监听request session context的创建和销毁
 * @date 2023/3/27 13:59
 */
@Slf4j
@WebListener
public class MyListener1 implements ServletContextListener, HttpSessionListener, ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
       log.info("context初始化");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
       log.info("context销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
      log.info("request销毁");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        log.info("request初始化");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
       log.info("session创建");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
       log.info("session销毁");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        log.info("request添加属性");
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        log.info("request删除属性");
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        log.info("request替换属性");
    }
}

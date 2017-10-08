package com.smartzhe.app.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by luohuahua on 17/10/8.
 */
@WebListener
public class AppContextListener implements ServletContextListener {
    private Logger log = LoggerFactory.getLogger(AppContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        log.info("IndexListener contextInitialized======");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

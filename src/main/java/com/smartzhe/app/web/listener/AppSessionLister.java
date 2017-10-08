package com.smartzhe.app.web.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**可以统计在线人数，只限于单台服务器
 * Created by luohuahua on 17/10/8.
 */
@WebListener
public class AppSessionLister implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext context = httpSessionEvent.getSession().getServletContext();
        if (context.getAttribute("count") == null) {
            context.setAttribute("count", 0);
        } else {
            int count = (Integer) context.getAttribute("count");
            context.setAttribute("count", count + 1);
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext context = httpSessionEvent.getSession().getServletContext();
        if (context.getAttribute("count") == null) {
            context.setAttribute("count", 0);
        } else {
            int count = (Integer) context.getAttribute("count");
            context.setAttribute("count", count - 1);
        }
    }
}

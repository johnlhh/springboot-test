package com.smartzhe.app.web.filter;

import org.springframework.beans.factory.annotation.Value;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by luohuahua on 17/10/8.
 */
@WebFilter(urlPatterns = "/*", filterName = "authFilter")
public class AuthFilter implements Filter {

    @Value("${name}")
    private String name;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("AuthFilter init()"+name);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("AuthFilter doFilter()"+name);
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("AuthFilter destroy()"+name);
    }
}

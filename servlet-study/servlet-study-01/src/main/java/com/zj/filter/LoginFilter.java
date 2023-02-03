package com.zj.filter;


import com.zj.domain.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author yuanyao
 * @Date 2022/9/9
 */
//@WebFilter(description = "对未登录的用户进行过滤", urlPatterns = "/*")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        Cookie cookie = new Cookie("username", "zhangjie"); // 创建一个cookie,用于保存用户信息
        User user = (User) request.getSession().getAttribute("user"); // 获取session作用域中的user
        // 如果session作用域中不存在user说明用户还没有登录，然后重定向到登录界面，让用户登录
        boolean contains = request.getRequestURI().contains("/login");
        System.out.println("request.getRequestURI = " + request.getRequestURI());
        if (user == null && !contains) { // session中不存在当前用户，并且请求的路径中不包含index.jsp,才会重定向
            response.sendRedirect("index.jsp");
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse); // 放行请求

    }

    @Override
    public void destroy() {

    }
}

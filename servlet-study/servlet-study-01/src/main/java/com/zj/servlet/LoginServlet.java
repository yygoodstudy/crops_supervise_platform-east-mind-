package com.zj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author yuanyao
 * @Date 2022/9/9
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置响应头信息
        resp.setContentType("text/html;charset=utf-8");
        /*
            HttpServletRequest:请求对象，Servlet容器会在请求到达后，创建一个Request对象，将Http请求相关的信息
            全部都封装在此对象中
         */
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("用户名：" + username + "，密码：" + password);

        // 获取输出流：
//        PrintWriter writer = resp.getWriter();
//        writer.write("登陆成功~~");

        req.setAttribute("mark", "zhangjie".equals(username) && "woaini".equals(password));
        // 请求转发
        req.getRequestDispatcher("/handleLogin").forward(req, resp);
    }
}

package com.zj.servlet;

import com.zj.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Filter;

/**
 * @Author yuanyao
 * @Date 2022/9/9
 */
@WebServlet(urlPatterns = {"/testFilter"})
public class TestFilterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("我没有登录，但是我访问了TestFilterServlet这个servlet");
        User user = (User) req.getSession().getAttribute("user");
        System.out.println(user == null ? "当前session中不存在user用户" : "当前session中存在" + user.getUsername() + "用户");
        System.out.println(user);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

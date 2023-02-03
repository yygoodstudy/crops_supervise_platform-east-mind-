package com.zj.servlet;

import com.zj.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 处理用户登录Servlet
 *
 * @Author yuanyao
 * @Date 2022/9/9
 */
@WebServlet(urlPatterns = {"/handleLogin", "/handle"})
public class HandleLoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.removeAttribute("errorMessage");
        resp.setContentType("text/html;charset=utf-8");
        boolean mark = (Boolean) req.getAttribute("mark");
        PrintWriter writer = resp.getWriter();
        if (mark) {
            // 给客户端设置cookie
            Cookie cookie = new Cookie("zhangjie", "yaoyuan5201314");
            resp.addCookie(cookie);

            // 给session中存入已经登录的用户
            req.getSession().setAttribute("user", new User(req.getParameter("username"), req.getParameter("password")));
            writer.write("欢迎你:<span style='color:red'>" + req.getParameter("username") + "</span>");
        } else {
            req.setAttribute("errorMessage", "账号或密码输入有误！");
            // 如果账号密码输入有误，重定向到到index.jsp页面;;
            // *******重定向不能访问WEB-INF下的资源文件，但是请求转发可以
//            resp.sendRedirect("/WEB-INF/fail.jsp");
            // 请求转发：/WEB-INF/fail.jsp，WEB-INF/fail.jsp两个路径都能访问fail.jsp文件
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}

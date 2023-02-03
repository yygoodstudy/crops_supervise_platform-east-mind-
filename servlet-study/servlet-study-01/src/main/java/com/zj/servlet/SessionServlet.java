package com.zj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * @Author yuanyao
 * @Date 2022/9/13
 */
@WebServlet("/sessionTest")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        session.setAttribute("name", "zhangjie");
        session.setAttribute("description", "love yaoyuan forever");
        session.setAttribute("time", new Date());

        String sessionId = session.getId(); // 获取该session对象的编号
        Cookie cookie = new Cookie("JSESSIONID", sessionId); // session id放在一个名为JESSESSIONID的cookie中
        cookie.setMaxAge(10 * 60); // 设置cookie的存活时间不随浏览器关闭而消失，保存在磁盘上

//        resp.addCookie(cookie);
        PrintWriter writer = resp.getWriter();
        writer.write("sessionId:" + sessionId); // 输出session id到页面
        writer.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

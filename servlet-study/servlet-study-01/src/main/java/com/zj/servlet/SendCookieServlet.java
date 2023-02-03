package com.zj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author yuanyao
 * @Date 2022/9/13
 */
@WebServlet(urlPatterns = "/sendCookie")
public class SendCookieServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("zhangjie", "5201314yaoyuan");
        cookie.setMaxAge(10 * 60); // 永久性的保存cookie;设置cookie10分钟之后过期，不会随着浏览器关闭而消亡
        resp.addCookie(cookie);

        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie1 : cookies) {
                if ("zhangjie".equals(cookie1.getName())) {
                    System.out.println(cookie1.getName() + ":" + cookie1.getValue());
                }
            }
        } else {
            System.out.println("当前还不存在该用户的cookie信息~~");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}

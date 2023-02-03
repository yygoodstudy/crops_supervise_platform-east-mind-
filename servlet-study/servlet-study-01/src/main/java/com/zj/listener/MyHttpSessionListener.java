package com.zj.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * HttpSession监听器：可以监听HttpSession的创建和销毁事件
 *
 * @Author yuanyao
 * @Date 2022/9/9
 */
@WebListener // 注册监听器
public class MyHttpSessionListener implements HttpSessionListener {
    static int i = 0;

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println(se.getSession() + "被创建了" + i++);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println(se.getSession() + "被销毁了" + i--);
    }
}

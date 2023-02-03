package com.zj.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 自定义监听器
 * 监听器是随web应用的启动而启动，只初始化一次，随web应用的停止而销毁。
 *
 * @Author yuanyao
 * @Date 2022/9/9
 */
@WebListener
public class MyServletContextListener implements ServletContextListener {

    /**
     * 监听器的用途 :
     * 　　1.通常使用Web监听器做以下的内容：
     * 　　2.统计在线人数，利用HttpSessionListener
     * 　　3.加载初始化信息：利用ServletContextListener
     * 　　4.统计网站访问量
     * 　　5.实现访问监控
     *
     * @param sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}

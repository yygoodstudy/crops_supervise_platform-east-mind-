package com.example.config;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author yuanyao
 * @Date 2022/9/14
 */
@Configuration
public class WebConfiguration {


    /*
     当客户端通过HTTP代理或者负载均衡访问应用服务器时，对于服务器来说，请求直接源自前置的代理服务器，
     那么此时获取到的远程IP实际为代理服务器的IP地址。HTTP协议通过“X-Forwarded-For“头信息记录了客户端
     到应用服务器前置代理的IP路径，因此可以通过该属性获知客户端的IP地址。
     Tomcat通过org.apache.catalina.filtersRemoteIpFilter实现了该功能。解析了参数，
     替换为真实请求的IP，通过ServletRequest.getRemoteAddr
     和ServletRequest.getRemoteHost获取相关信息。
     */
    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter(); //
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        // 通过FilterRegistrationBean这个类将我们自定义的Filter加入到spring容器中
        FilterRegistrationBean<Filter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new MyFilter()); // 设置将要被注册的Filter
        registrationBean.addInitParameter("age", "18");
        registrationBean.addInitParameter("name", "zj");
        registrationBean.addInitParameter("address", "雁塔区");
        return registrationBean;
    }

    public class MyFilter implements Filter {

        private FilterConfig filterConfig;

        @Override
        public void init(FilterConfig filterConfig) throws ServletException { // init方法在Tomcat容器启动的时候执行
            this.filterConfig = filterConfig;

            Enumeration<String> initParameterNames = filterConfig.getInitParameterNames(); // 获取所有的初始化参数
            int i = 1;
            while (initParameterNames.hasMoreElements()) {
                String param = initParameterNames.nextElement();
                String value = filterConfig.getInitParameter(param);
                System.out.println("param" + i++ + " = " + param + ",value=" + value);
            }
        }

        @Override
        public void destroy() {
            System.out.println("destroy()方法被执行了....");
        }

        @Override
        public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
            HttpServletRequest request = (HttpServletRequest) servletRequest;
            System.out.println("MyFilter拦截到了请求：" + request.getRequestURL()); // getRequestURI():获取部分路径，getRequestURL：获取全路径
            // 自定义Filter执行完过滤逻辑后放行请求
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }
}

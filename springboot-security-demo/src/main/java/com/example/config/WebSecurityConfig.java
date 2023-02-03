package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @Author yuanyao
 * @Date 2022/9/14
 */
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityWebFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/", "/home").permitAll() // / 和/home路径可以不用登录认证
                .anyRequest().authenticated() // 其它任何请求都需要认证
                .and()
                .formLogin() // form表单登录方式
                .loginPage("/login.html")// 登录页面路径
//                .failureForwardUrl("/error") // 登录失败跳转路径
                .successHandler((request, response, authentication) -> { // 登录成功之后做一些事情
                    System.out.println("request.getRequestURL() = " + request.getRequestURL());
                    response.sendRedirect("/hello");
                })
//                .successForwardUrl("/hello") // 登录成功跳转路径
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and().csrf().disable();


        return httpSecurity.build();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // 密码加密器
    }
}

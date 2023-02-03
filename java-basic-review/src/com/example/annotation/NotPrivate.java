package com.example.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Retention(RetentionPolicy.RUNTIME) // 解释说明了这个注解的存活时间，
@Documented
@Target(ElementType.METHOD) // METHOD：只能标注在方法上
@Inherited
public @interface NotPrivate {
    int id() default 1;

    String message() default "i'm an annotation";
}

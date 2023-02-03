package com.example.annotation;

import java.lang.annotation.*;

/**
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Retention(RetentionPolicy.RUNTIME) // 解释说明了这个注解的存活时间，
@Documented
@Target(ElementType.TYPE) // METHOD：只能标注在方法上
@Inherited
public @interface Check {
    String desc() default "最美的不是下雨天";
    String value() default "天涯的尽头是风沙，红尘的尽头叫牵挂";
}

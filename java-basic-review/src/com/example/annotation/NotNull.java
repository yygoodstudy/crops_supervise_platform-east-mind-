package com.example.annotation;

import java.lang.annotation.*;

/**
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Retention(RetentionPolicy.RUNTIME) // 解释说明了这个注解的存活时间，
@Documented
@Target(ElementType.FIELD) // METHOD：只能标注在方法上
@Inherited
public @interface NotNull {
    String message();
}

package com.example.annotation;

import java.lang.annotation.*;

/**
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Retention(RetentionPolicy.RUNTIME) // ����˵�������ע��Ĵ��ʱ�䣬
@Documented
@Target(ElementType.FIELD) // METHOD��ֻ�ܱ�ע�ڷ�����
@Inherited
public @interface NotNull {
    String message();
}

package com.example.annotation;

import java.lang.annotation.*;

/**
 * �Զ���ע��
 *
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Retention(RetentionPolicy.RUNTIME) // ����˵�������ע��Ĵ��ʱ�䣬
@Documented
@Target(ElementType.METHOD) // METHOD��ֻ�ܱ�ע�ڷ�����
@Inherited
public @interface NotPrivate {
    int id() default 1;

    String message() default "i'm an annotation";
}

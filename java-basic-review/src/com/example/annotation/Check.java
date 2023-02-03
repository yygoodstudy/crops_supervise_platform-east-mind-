package com.example.annotation;

import java.lang.annotation.*;

/**
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Retention(RetentionPolicy.RUNTIME) // ����˵�������ע��Ĵ��ʱ�䣬
@Documented
@Target(ElementType.TYPE) // METHOD��ֻ�ܱ�ע�ڷ�����
@Inherited
public @interface Check {
    String desc() default "�����Ĳ���������";
    String value() default "���ĵľ�ͷ�Ƿ�ɳ���쳾�ľ�ͷ��ǣ��";
}

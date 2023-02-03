package com.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Check(desc = "��˵�Ѱ��������»��߸�Զ~") // ���һ��ע�����һ����value������ʱ������������Ե�ʱ����Բ���д����
public class Test001 {

    @NotNull(message = "info�ֶβ���Ϊ��!")
    private String info;

    @NotPrivate(id = 1, message = "Ե����������ǣ�٤����������������")
    public void test() {
        System.out.println("��ʲ�Ϊ���ţ�@#");
    }

    @SuppressWarnings("deprecation")
    private void test2() {
        System.out.println("zdf123");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        // �ж������Ƿ����ĳ��ע��
        boolean present = Test001.class.isAnnotationPresent(Check.class);
        if (present) {
            // ��ȡ���ע��
            Check annotation = Test001.class.getAnnotation(Check.class);
            System.out.println("Check annotation value��" + annotation.desc());
            System.out.println("Check annotation value��" + annotation.value());
            // ��ȡ��������ע��
            Annotation[] annotations = Test001.class.getAnnotations();
            if (annotations.length == 1) {
                Check check = (Check) annotations[0];
                System.err.println(check.value());
                System.err.println(check.desc());
            }
        }

        Method testMethod = Test001.class.getDeclaredMethod("test");
        NotPrivate notPrivate = testMethod.getAnnotation(NotPrivate.class);
        System.out.println("notPrivate.id() = " + notPrivate.id());
        System.out.println("notPrivate.message() = " + notPrivate.message());
    }
}

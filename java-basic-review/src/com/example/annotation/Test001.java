package com.example.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author yuanyao
 * @Date 2022/11/9
 */
@Check(desc = "你说把爱渐渐放下会走更远~") // 如果一个注解仅有一个叫value的属性时，再用这个属性的时候可以不用写名字
public class Test001 {

    @NotNull(message = "info字段不能为空!")
    private String info;

    @NotPrivate(id = 1, message = "缘分落地是我们，伽蓝寺听雨声盼永恒")
    public void test() {
        System.out.println("提笔不为风雅！@#");
    }

    @SuppressWarnings("deprecation")
    private void test2() {
        System.out.println("zdf123");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        // 判断类上是否存在某个注解
        boolean present = Test001.class.isAnnotationPresent(Check.class);
        if (present) {
            // 获取类的注解
            Check annotation = Test001.class.getAnnotation(Check.class);
            System.out.println("Check annotation value：" + annotation.desc());
            System.out.println("Check annotation value：" + annotation.value());
            // 获取类上所有注解
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

package com.example.javabasic;

import org.springframework.util.StringUtils;

/**
 * @Author yuanyao
 * @Date 2023/1/30
 */
public class LongValueDemo1 {
    public static void main(String[] args) {
        Long a1 = 1100L;
        Long a2 = 1100L;
        System.out.println(a1 == a2);

        System.out.println(a1.equals(1100));

        Long aLong = Long.valueOf(1100);

        Long aLong1 = LongValueDemo1.valueOf(100);
        System.out.println("aLong1 = " + aLong1);

        boolean sdf = StringUtils.hasText("sdf");
        System.out.println("sdf = " + sdf);

        String a = " ";
        a.isEmpty(); // 只判断长度是否为0
        System.out.println("a.length() = " + a.length());

        boolean b = StringUtils.containsWhitespace("adc12-3");
        System.out.println("b = " + b);

        System.out.println("------------------");
        CharSequence cs = "hello world";
        System.out.println("cs = " + cs);
    }

    private static class LongCache {
        private LongCache() {
        }

        static final Long cache[] = new Long[-(-128) + 127 + 1];

        static {
            for (int i = 0; i < cache.length; i++) {
                cache[i] = new Long(i - 128);
                System.out.println("cache["+i+"]="+cache[i]);
            }
        }
    }

    public static Long valueOf(long l) {
        final int offset = 128;
        if (l >= -128 && l <= 127) { // will cache
            int length = LongCache.cache.length;
            System.out.println("cache length = " + length);
            return LongValueDemo1.LongCache.cache[(int) l + offset];
        }
        return new Long(l);
    }

}

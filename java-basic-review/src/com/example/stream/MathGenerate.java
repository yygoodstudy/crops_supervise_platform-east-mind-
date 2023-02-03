package com.example.stream;

import javax.annotation.processing.SupportedSourceVersion;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
@SuppressWarnings("all")
public class MathGenerate {

    public static void main(String[] args) {
        List<Double> generate = generate(4.5, 5.5, 30);
        System.out.println(generate);
        System.out.println(generate.size());

//        List<Double> doubles = generateNew(1, 2, 30);
//        System.out.println(doubles);
//        System.out.println(doubles.size());
    }

    /**
     * ????????????????????double?
     *
     * @param begin ????
     * @param end   ?????
     * @param limit ?????????
     */
    public static List<Double> generate(double begin, double end, int limit) {
        DecimalFormat df = new DecimalFormat("#.00");
        List<Double> ds = new ArrayList<>();
        while (ds.size() < limit) {
            double random = Math.random() * 10;
            String format = df.format(random);
            double ad = Double.parseDouble(format);
            if (ad < begin || ad > end) {
                continue;
            }
            ds.add(ad);
        }
        return ds;
    }

    /**
     * ????0.7-1.3????double?????????
     * @param begin
     * @param end
     * @param limit
     * @return
     */
    public static List<Double> generateNew(double begin, double end, int limit) {
        DecimalFormat df = new DecimalFormat("#.00");
        List<Double> ds = new ArrayList<>();
        while (ds.size() < limit) {
            double random = Math.random() * 10;
            String format = df.format(random);
            double ad = Double.parseDouble(format);

            if (ad < begin || ad > end) {
                continue;
            }
            double v = ad - 0.3;
            if (v < 0.7 || v > 1.3) {
                continue;
            }
            ds.add(Double.parseDouble(df.format(v)));
        }
        return ds;
    }

}

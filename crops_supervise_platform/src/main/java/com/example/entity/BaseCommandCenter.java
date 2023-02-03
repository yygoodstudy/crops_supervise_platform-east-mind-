package com.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yuanyao
 * @Date 2022/9/27
 */
@TableName("screen_command_center")
@Data
public class BaseCommandCenter {
    @TableId("id")
    private Long id;
    @TableField("user_type_code")
    private Integer userTypeCode;
    @TableField("type_name")
    private String typeName;
    @TableField("province_id")
    private Integer provinceId;
    @TableField("city_id")
    private Integer cityId;
    @TableField("head_id")
    private Integer headId;
    @TableField("data")
    private String data;


    /**
     * 生成上涨、浮动、下降所对应的数据
     *
     * @param number     控制生成几个
     * @param trend      趋势？上涨，浮动，下降
     * @param cardinal   基数
     * @param floatRange 浮动区间
     * @return 数据集合
     */
    public static List<Integer> generateData(int number, int trend, double floatRange, int cardinal) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(cardinal); // 添加基数
        for (int i = 1; i < number; i++) {
            if (trend == 0) { // 上涨
                int val = (int) (numbers.get(i - 1) + numbers.get(i - 1) * floatRange);
                numbers.add(val);
            }
            if (trend == 1) {
                int val;
                if (i % 2 == 0) {
                    val = (int) (numbers.get(i - 1) + numbers.get(i - 1) * floatRange);
                } else {
                    val = (int) (numbers.get(i - 1) - numbers.get(i - 1) * floatRange);
                }
                numbers.add(val);
            }
            if (trend == 2) {
                int val = (int) (numbers.get(i - 1) - numbers.get(i - 1) * floatRange);
                numbers.add(val);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> integers = generateData(9, 2, 0.12, 1000);
        integers.forEach(System.out::println);
    }
}

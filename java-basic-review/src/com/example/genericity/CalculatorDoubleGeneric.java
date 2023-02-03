package com.example.genericity;

/**
 * @Author yuanyao
 * @Date 2022/11/10
 */
public class CalculatorDoubleGeneric implements CalGeneric<Double>{
    @Override
    public Double add(Double a, Double b) {
        return a+b;
    }

    @Override
    public Double sub(Double a, Double b) {
        return null;
    }

    @Override
    public Double mul(Double a, Double b) {
        return null;
    }

    @Override
    public Double div(Double a, Double b) {
        return null;
    }
}

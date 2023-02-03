package com.example.exception;

import lombok.Data;

/**
 * @Author yuanyao
 * @Date 2022/9/13
 */
@Data
public class ErrorInfo<T> {

    public static final String status = "ERROR";
    public static final Integer ERROR_CODE = 500;

    private String errStatus = status;
    private Integer errCode = ERROR_CODE;
    private T data;

    public T getData() {
        return data;
    }

}

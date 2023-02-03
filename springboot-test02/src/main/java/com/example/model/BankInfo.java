package com.example.model;

import lombok.Data;

@Data
public class BankInfo {

    private Integer bankId; // 银行ID
    private String bankName; // 银行名称
    private String subBranchName; // 支行名称
    private String address; // 银行地址

}

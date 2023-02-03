package com.example.service.impl;

import com.example.model.BankInfo;
import com.example.service.BankService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class BankServiceImpl implements BankService {

    private Logger logger = LoggerFactory.getLogger(BankServiceImpl.class);

    @Override
    public BankInfo bankInfo(Integer id) {
        // 模拟从数据库中查询数据
        BankInfo bankInfo = new BankInfo();
        bankInfo.setBankId(1);
        bankInfo.setBankName("招商银行枫林绿洲支行");
        bankInfo.setSubBranchName("枫林绿洲支支行");
        bankInfo.setAddress("陕西省西安市雁塔区");
        return bankInfo;
    }

    @Override
    public String saveBank(BankInfo bankInfo) {
        logger.info("保存的银行信息为：{} 支行名称为：{}", bankInfo, bankInfo.getSubBranchName());
        return StringUtils.isEmpty(bankInfo.getBankName()) ? "保存银行信息失败！" : "保存银行信息成功~";
    }

    public String referSaveBank(BankInfo bankInfo){
        saveBank(bankInfo);
        return "";
    }
}

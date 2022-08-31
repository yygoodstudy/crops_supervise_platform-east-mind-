package com.example.crops_supervise_platform.entity;

/**
 * 监管客户基础信息
 */
public class CustomerBasicInformation {

    private Integer id; // 主键
    private String farmerName; // 种植户姓名
    private String phone; // 联系电话
    private String bank; // 贷款银行
    private Double loanAmount; // 贷款金额(万)
    private Double perMuAmount; // 每亩贷款金额(万)
    private Integer cultivatedMus; // 种植亩数(亩)
    private String plantItemSpecies; // 种植物品种
    private Double insuredAmount; // 保险金额(万)
    private Double estimated; // 预计产量(吨/亩)
    private Double aboutIncome; // 预计毛收入(万)
    private Double realIncome; // 实际毛收入(万)
    private Double deliveryQuantity; // 交货数量
    private Double repaidAmount; // 已还款金额(万)
    private String regulatoryStatus; // 监管状态
    private String deliveryState; // 交货状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFarmerName() {
        return farmerName;
    }

    public void setFarmerName(String farmerName) {
        this.farmerName = farmerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Double getPerMuAmount() {
        return perMuAmount;
    }

    public void setPerMuAmount(Double perMuAmount) {
        this.perMuAmount = perMuAmount;
    }

    public Integer getCultivatedMus() {
        return cultivatedMus;
    }

    public void setCultivatedMus(Integer cultivatedMus) {
        this.cultivatedMus = cultivatedMus;
    }

    public String getPlantItemSpecies() {
        return plantItemSpecies;
    }

    public void setPlantItemSpecies(String plantItemSpecies) {
        this.plantItemSpecies = plantItemSpecies;
    }

    public Double getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(Double insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public Double getEstimated() {
        return estimated;
    }

    public void setEstimated(Double estimated) {
        this.estimated = estimated;
    }

    public Double getAboutIncome() {
        return aboutIncome;
    }

    public void setAboutIncome(Double aboutIncome) {
        this.aboutIncome = aboutIncome;
    }

    public Double getRealIncome() {
        return realIncome;
    }

    public void setRealIncome(Double realIncome) {
        this.realIncome = realIncome;
    }

    public Double getDeliveryQuantity() {
        return deliveryQuantity;
    }

    public void setDeliveryQuantity(Double deliveryQuantity) {
        this.deliveryQuantity = deliveryQuantity;
    }

    public Double getRepaidAmount() {
        return repaidAmount;
    }

    public void setRepaidAmount(Double repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    public String getRegulatoryStatus() {
        return regulatoryStatus;
    }

    public void setRegulatoryStatus(String regulatoryStatus) {
        this.regulatoryStatus = regulatoryStatus;
    }

    public String getDeliveryState() {
        return deliveryState;
    }

    public void setDeliveryState(String deliveryState) {
        this.deliveryState = deliveryState;
    }
}

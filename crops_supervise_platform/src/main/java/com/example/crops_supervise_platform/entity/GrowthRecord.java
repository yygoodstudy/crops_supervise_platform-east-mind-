package com.example.crops_supervise_platform.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * 追肥除草长势记录
 */
public class GrowthRecord {
    private Integer id; // 主键
    private String farmerName; // 种植户姓名
    private String phone; // 联系电话
    private String sproutCondition; // 出苗情况
    private String fillSeedlings; // 提苗
    private String mentionMiao; // 补苗
    private String ifWeeded; // 是否除草
    private String ifTopDressing; // 是否追肥
    private String topDressingType; // 追肥类型
    private String wateringQuantity; // 浇水量
    private String soilAccessResult; // 土壤评估结果
    private String inspectionPerson; // 巡检人员
    private String functionary; // 负责人
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date inspectionDate; // 巡检日期

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

    public String getSproutCondition() {
        return sproutCondition;
    }

    public void setSproutCondition(String sproutCondition) {
        this.sproutCondition = sproutCondition;
    }

    public String getFillSeedlings() {
        return fillSeedlings;
    }

    public void setFillSeedlings(String fillSeedlings) {
        this.fillSeedlings = fillSeedlings;
    }

    public String getMentionMiao() {
        return mentionMiao;
    }

    public void setMentionMiao(String mentionMiao) {
        this.mentionMiao = mentionMiao;
    }

    public String getIfWeeded() {
        return ifWeeded;
    }

    public void setIfWeeded(String ifWeeded) {
        this.ifWeeded = ifWeeded;
    }

    public String getIfTopDressing() {
        return ifTopDressing;
    }

    public void setIfTopDressing(String ifTopDressing) {
        this.ifTopDressing = ifTopDressing;
    }

    public String getTopDressingType() {
        return topDressingType;
    }

    public void setTopDressingType(String topDressingType) {
        this.topDressingType = topDressingType;
    }

    public String getWateringQuantity() {
        return wateringQuantity;
    }

    public void setWateringQuantity(String wateringQuantity) {
        this.wateringQuantity = wateringQuantity;
    }

    public String getSoilAccessResult() {
        return soilAccessResult;
    }

    public void setSoilAccessResult(String soilAccessResult) {
        this.soilAccessResult = soilAccessResult;
    }

    public String getInspectionPerson() {
        return inspectionPerson;
    }

    public void setInspectionPerson(String inspectionPerson) {
        this.inspectionPerson = inspectionPerson;
    }

    public String getFunctionary() {
        return functionary;
    }

    public void setFunctionary(String functionary) {
        this.functionary = functionary;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }
}

package hr.entity;

import java.util.Date;

public class training {
    private Short traId;

    private String majorKindId;

    private String majorKindName;

    private String majorId;

    private String majorName;

    private String humanId;

    private String humanName;

    private String trainingItem;

    private Date trainingTime;

    private Integer trainingHour;

    private String trainingDegree;

    private String register;

    private String checker;

    private Date registTime;

    private Date checkTime;

    private Short checkstatus;

    private String remark;

    public Short getTraId() {
        return traId;
    }

    public void setTraId(Short traId) {
        this.traId = traId;
    }

    public String getMajorKindId() {
        return majorKindId;
    }

    public void setMajorKindId(String majorKindId) {
        this.majorKindId = majorKindId;
    }

    public String getMajorKindName() {
        return majorKindName;
    }

    public void setMajorKindName(String majorKindName) {
        this.majorKindName = majorKindName;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getHumanId() {
        return humanId;
    }

    public void setHumanId(String humanId) {
        this.humanId = humanId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getTrainingItem() {
        return trainingItem;
    }

    public void setTrainingItem(String trainingItem) {
        this.trainingItem = trainingItem;
    }

    public Date getTrainingTime() {
        return trainingTime;
    }

    public void setTrainingTime(Date trainingTime) {
        this.trainingTime = trainingTime;
    }

    public Integer getTrainingHour() {
        return trainingHour;
    }

    public void setTrainingHour(Integer trainingHour) {
        this.trainingHour = trainingHour;
    }

    public String getTrainingDegree() {
        return trainingDegree;
    }

    public void setTrainingDegree(String trainingDegree) {
        this.trainingDegree = trainingDegree;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Short getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(Short checkstatus) {
        this.checkstatus = checkstatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
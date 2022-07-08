package com.junyi.entity;

import java.io.Serializable;
import java.util.Date;

public class ParkCustomerService implements Serializable {
    private Long id;

    private String csName;

    private String csPhone;

    private String csRemark;

    private Byte isLoad;

    private Date createTime;

    private String createUser;

    private Date modifyTime;

    private String modifyUserName;

    private Integer parkId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCsName() {
        return csName;
    }

    public void setCsName(String csName) {
        this.csName = csName;
    }

    public String getCsPhone() {
        return csPhone;
    }

    public void setCsPhone(String csPhone) {
        this.csPhone = csPhone;
    }

    public String getCsRemark() {
        return csRemark;
    }

    public void setCsRemark(String csRemark) {
        this.csRemark = csRemark;
    }

    public Byte getIsLoad() {
        return isLoad;
    }

    public void setIsLoad(Byte isLoad) {
        this.isLoad = isLoad;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyUserName() {
        return modifyUserName;
    }

    public void setModifyUserName(String modifyUserName) {
        this.modifyUserName = modifyUserName;
    }

    public Integer getParkId() {
        return parkId;
    }

    public void setParkId(Integer parkId) {
        this.parkId = parkId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", csName=").append(csName);
        sb.append(", csPhone=").append(csPhone);
        sb.append(", csRemark=").append(csRemark);
        sb.append(", isLoad=").append(isLoad);
        sb.append(", createTime=").append(createTime);
        sb.append(", createUser=").append(createUser);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", modifyUserName=").append(modifyUserName);
        sb.append(", parkId=").append(parkId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
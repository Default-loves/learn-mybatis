package com.junyi.entity;

import java.io.Serializable;
import java.util.Date;

public class UploadEvent implements Serializable {
    private String carNo;

    private String dsn;

    private Integer eventType;

    private Date eventTime;

    private Integer carType;

    private Integer carColorType;

    private String inPic;

    private String smallPic;

    private static final long serialVersionUID = 1L;

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getDsn() {
        return dsn;
    }

    public void setDsn(String dsn) {
        this.dsn = dsn;
    }

    public Integer getEventType() {
        return eventType;
    }

    public void setEventType(Integer eventType) {
        this.eventType = eventType;
    }

    public Date getEventTime() {
        return eventTime;
    }

    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getCarColorType() {
        return carColorType;
    }

    public void setCarColorType(Integer carColorType) {
        this.carColorType = carColorType;
    }

    public String getInPic() {
        return inPic;
    }

    public void setInPic(String inPic) {
        this.inPic = inPic;
    }

    public String getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", carNo=").append(carNo);
        sb.append(", dsn=").append(dsn);
        sb.append(", eventType=").append(eventType);
        sb.append(", eventTime=").append(eventTime);
        sb.append(", carType=").append(carType);
        sb.append(", carColorType=").append(carColorType);
        sb.append(", inPic=").append(inPic);
        sb.append(", smallPic=").append(smallPic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
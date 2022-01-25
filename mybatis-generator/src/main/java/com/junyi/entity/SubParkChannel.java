package com.junyi.entity;

import java.io.Serializable;

public class SubParkChannel implements Serializable {
    private Integer id;

    private Integer pId;

    private Integer machNo;

    private String channelName;

    private String dsn;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getMachNo() {
        return machNo;
    }

    public void setMachNo(Integer machNo) {
        this.machNo = machNo;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public String getDsn() {
        return dsn;
    }

    public void setDsn(String dsn) {
        this.dsn = dsn;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pId=").append(pId);
        sb.append(", machNo=").append(machNo);
        sb.append(", channelName=").append(channelName);
        sb.append(", dsn=").append(dsn);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
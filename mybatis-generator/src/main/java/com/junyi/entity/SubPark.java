package com.junyi.entity;

import java.io.Serializable;

public class SubPark implements Serializable {
    private Integer id;

    private Integer pType;

    private String pName;

    private Integer manageBoxId;

    private Integer limitCardType;

    private Integer totalSpace;

    private String inDsns;

    private String inNames;

    private String outDsns;

    private String outNames;

    private Byte delete;

    private Byte limit;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getpType() {
        return pType;
    }

    public void setpType(Integer pType) {
        this.pType = pType;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getManageBoxId() {
        return manageBoxId;
    }

    public void setManageBoxId(Integer manageBoxId) {
        this.manageBoxId = manageBoxId;
    }

    public Integer getLimitCardType() {
        return limitCardType;
    }

    public void setLimitCardType(Integer limitCardType) {
        this.limitCardType = limitCardType;
    }

    public Integer getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(Integer totalSpace) {
        this.totalSpace = totalSpace;
    }

    public String getInDsns() {
        return inDsns;
    }

    public void setInDsns(String inDsns) {
        this.inDsns = inDsns;
    }

    public String getInNames() {
        return inNames;
    }

    public void setInNames(String inNames) {
        this.inNames = inNames;
    }

    public String getOutDsns() {
        return outDsns;
    }

    public void setOutDsns(String outDsns) {
        this.outDsns = outDsns;
    }

    public String getOutNames() {
        return outNames;
    }

    public void setOutNames(String outNames) {
        this.outNames = outNames;
    }

    public Byte getDelete() {
        return delete;
    }

    public void setDelete(Byte delete) {
        this.delete = delete;
    }

    public Byte getLimit() {
        return limit;
    }

    public void setLimit(Byte limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", pType=").append(pType);
        sb.append(", pName=").append(pName);
        sb.append(", manageBoxId=").append(manageBoxId);
        sb.append(", limitCardType=").append(limitCardType);
        sb.append(", totalSpace=").append(totalSpace);
        sb.append(", inDsns=").append(inDsns);
        sb.append(", inNames=").append(inNames);
        sb.append(", outDsns=").append(outDsns);
        sb.append(", outNames=").append(outNames);
        sb.append(", delete=").append(delete);
        sb.append(", limit=").append(limit);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.junyi.test.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author jy
 * @since 2022-07-13
 */
@TableName("park_customer_service")
@ApiModel(value = "ParkCustomerService对象", description = "")
public class ParkCustomerService implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("姓名")
    private String csName;

    @ApiModelProperty("电话")
    private String csPhone;

    @ApiModelProperty("备注")
    private String csRemark;

    @ApiModelProperty("0未上传 1已上传")
    private Byte isLoad;

    @ApiModelProperty("删除标志。0-未删除、1-已删除")
    private Byte isDelete;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty("创建人")
    private String createUser;

    @ApiModelProperty("更新时间")
    private LocalDateTime modifyTime;

    @ApiModelProperty("修改人")
    private String modifyUserName;

    @ApiModelProperty("车场编号")
    private Integer parkId;

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

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(LocalDateTime modifyTime) {
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
        return "ParkCustomerService{" +
            "id = " + id +
            ", csName = " + csName +
            ", csPhone = " + csPhone +
            ", csRemark = " + csRemark +
            ", isLoad = " + isLoad +
            ", isDelete = " + isDelete +
            ", createTime = " + createTime +
            ", createUser = " + createUser +
            ", modifyTime = " + modifyTime +
            ", modifyUserName = " + modifyUserName +
            ", parkId = " + parkId +
        "}";
    }
}

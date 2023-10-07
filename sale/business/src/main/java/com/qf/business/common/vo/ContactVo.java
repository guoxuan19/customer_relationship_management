package com.qf.business.common.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.qf.business.entity.Dept;
import lombok.Data;

import java.util.Date;

/**
 * 联系人表
 */
@Data
@TableName(value = "t_contact")
public class ContactVo {
    /**
     * id主键
     */
    @TableId(value = "contact_id", type = IdType.INPUT)
    private Integer contactId;

    /**
     * 联系人姓名
     */
    @TableField(value = "contact_name")
    private String contactName;

    /**
     * 联系人手机
     */
    @TableField(value = "contact_phone")
    private String contactPhone;

    /**
     * 联系人固话
     */
    @TableField(value = "contact_landline")
    private String contactLandline;

    /**
     * 联系人部门Id
     */
    @TableField(value = "dept_id")
    private Integer deptId;

    /**
     * 所属职务
     */
    @TableField(value = "contact_position")
    private String contactPosition;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 联系人状态 0表示离职 1表示在职
     */
    @TableField(value = "contact_status")
    private Integer contactStatus;

    private DeptVo deptVo;//关联属性-部门
}

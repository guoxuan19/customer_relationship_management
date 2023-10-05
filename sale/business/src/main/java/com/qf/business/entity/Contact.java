package com.qf.business.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 联系人表
    */
@Data
@TableName(value = "t_contact")
public class Contact {
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
    private Date createTime;

    /**
     * 联系人状态 0表示离职 1表示在职 
     */
    @TableField(value = "contact_status")
    private Integer contactStatus;

    public static final String COL_CONTACT_ID = "contact_id";

    public static final String COL_CONTACT_NAME = "contact_name";

    public static final String COL_CONTACT_PHONE = "contact_phone";

    public static final String COL_CONTACT_LANDLINE = "contact_landline";

    public static final String COL_DEPT_ID = "dept_id";

    public static final String COL_CONTACT_POSITION = "contact_position";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CONTACT_STATUS = "contact_status";
}
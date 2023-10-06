package com.qf.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 基础设置表
    */
@Data
@TableName(value = "t_basic_setting")
public class BasicSetting {
    /**
     * 主键
     */
    @TableId(value = "basic_setting_id", type = IdType.INPUT)
    private Integer basicSettingId;

    /**
     * 类型
     */
    @TableField(value = "`type`")
    private String type;

    /**
     * 值
     */
    @TableField(value = "`value`")
    private String value;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人Id
     */
    @TableField(value = "create_id")
    private Long createId;

    /**
     * 1表示正常，0表示删除
     */
    @TableField(value = "`status`")
    private Integer status;

    public static final String COL_BASIC_SETTING_ID = "basic_setting_id";

    public static final String COL_TYPE = "type";

    public static final String COL_VALUE = "value";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_ID = "create_id";

    public static final String COL_STATUS = "status";
}
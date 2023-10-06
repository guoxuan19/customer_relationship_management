package com.qf.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 角色表
    */
@Data
@TableName(value = "t_role")
public class Role {
    /**
     * 主键
     */
    @TableId(value = "role_id", type = IdType.INPUT)
    private Integer roleId;

    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 1表示正常，0表示删除
     */
    @TableField(value = "`status`")
    private Integer status;

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_ROLE_NAME = "role_name";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_STATUS = "status";
}
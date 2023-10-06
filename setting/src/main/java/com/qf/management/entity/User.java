package com.qf.management.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
    * 用户表
    */
@Data
@TableName(value = "t_user")
public class User {
    /**
     * 主键
     */
    @TableId(value = "user_id", type = IdType.INPUT)
    private Long userId;

    /**
     * 用户性名
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 用户登录账号名
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 商城账号
     */
    @TableField(value = "mall_account")
    private String mallAccount;

    /**
     * 性别
     */
    @TableField(value = "sex")
    private Integer sex;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 角色Id
     */
    @TableField(value = "role_id")
    private Integer roleId;

    /**
     * 部门Id
     */
    @TableField(value = "department_id")
    private Integer departmentId;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 1表示正常，0表示删除
     */
    @TableField(value = "`status`")
    @TableLogic(value = "1",delval = "0")
    private Integer status;

    public static final String COL_USER_ID = "user_id";

    public static final String COL_NAME = "name";

    public static final String COL_USER_NAME = "user_name";

    public static final String COL_MALL_ACCOUNT = "mall_account";

    public static final String COL_SEX = "sex";

    public static final String COL_PHONE = "phone";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_DEPARTMENT_ID = "department_id";

    public static final String COL_PASSWORD = "password";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_STATUS = "status";
}
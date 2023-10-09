package com.qf.customer.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 我的客户表
 */
@Data
@TableName(value = "t_my_customer")
public class Customer {
    /**
     * 主键
     */
    @TableId(value = "customer_id", type = IdType.INPUT)
    private Integer customerId;

    /**
     * 客户手机
     */
    @TableField(value = "customer_phone")
    private String customerPhone;

    /**
     * 客户名称
     */
    @TableField(value = "customer_name")
    private String customerName;

    /**
     * 登录时间
     */
    @TableField(value = "login_time")
    private Date loginTime;

    /**
     * 状态: 0表示删除，1表示正常
     */
    @TableField(value = "customer_status")
    private Integer customerStatus;

    /**
     * 客户订单号
     */
    @TableField(value = "customer_order")
    private String customerOrder;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    public static final String COL_CUSTOMER_ID = "customer_id";

    public static final String COL_CUSTOMER_PHONE = "customer_phone";

    public static final String COL_CUSTOMER_NAME = "customer_name";

    public static final String COL_LOGIN_TIME = "login_time";

    public static final String COL_CUSTOMER_STATUS = "customer_status";

    public static final String COL_CUSTOMER_ORDER = "customer_order";

    public static final String COL_CREATE_TIME = "create_time";
}
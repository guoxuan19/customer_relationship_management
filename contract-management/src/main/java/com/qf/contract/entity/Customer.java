package com.qf.contract.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 客户表
    */
@Data
@TableName(value = "t_customer00")
public class Customer {
    /**
     * 主键
     */
    @TableId(value = "customer_id", type = IdType.INPUT)
    private Integer customerId;

    /**
     * 客户名称
     */
    @TableField(value = "customer_name")
    private String customerName;

    /**
     * 状态，0删除，1正常
     */
    @TableField(value = "customer_status")
    private Integer customerStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    public static final String COL_CUSTOMER_ID = "customer_id";

    public static final String COL_CUSTOMER_NAME = "customer_name";

    public static final String COL_CUSTOMER_STATUS = "customer_status";

    public static final String COL_CREATE_TIME = "create_time";
}
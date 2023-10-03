package com.qf.contract.common.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
    * 客户表
    */
@Data
@TableName(value = "t_customer00")
public class CustomerVo {
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


}
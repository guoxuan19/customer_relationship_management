package com.qf.contract.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 商机表
    */
@Data
@TableName(value = "t_business_opportunity00")
public class BusinessOpportunity {
    /**
     * 主键
     */
    @TableId(value = "business_opportunity_id", type = IdType.INPUT)
    private Integer businessOpportunityId;

    /**
     * 商机名称
     */
    @TableField(value = "business_opportunity_name")
    private String businessOpportunityName;

    /**
     * 状态，0删除，1正常
     */
    @TableField(value = "business_opportunity_status")
    private Integer businessOpportunityStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 客户id
     */
    @TableField(value = "customer_id")
    private Integer customerId;

    public static final String COL_BUSINESS_OPPORTUNITY_ID = "business_opportunity_id";

    public static final String COL_BUSINESS_OPPORTUNITY_NAME = "business_opportunity_name";

    public static final String COL_BUSINESS_OPPORTUNITY_STATUS = "business_opportunity_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CUSTOMER_ID = "customer_id";
}
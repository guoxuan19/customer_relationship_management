package com.qf.contract.common.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 商机表
    */
@Data
@TableName(value = "t_business_opportunity00")
public class BusinessOpportunityVo {
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
     * 客户id
     */
    @TableField(value = "customer_id")
    private Integer customerId;

    private CustomerVo customerVo;//关联属性，客户

}
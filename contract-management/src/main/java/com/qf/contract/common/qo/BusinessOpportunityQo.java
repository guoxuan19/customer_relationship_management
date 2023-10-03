package com.qf.contract.common.qo;

import lombok.Data;


/**
    * 商机表
    */
@Data
public class BusinessOpportunityQo {
    /**
     * 主键
     */
    private Integer businessOpportunityId;

    /**
     * 商机名称
     */
    private String businessOpportunityName;

    /**
     * 状态，0删除，1正常
     */
    private Integer businessOpportunityStatus;


    /**
     * 客户id
     */
    private Integer customerId;

}
package com.qf.contract.common.qo;

import lombok.Data;


/**
    * 客户表
    */
@Data
public class CustomerQo {
    /**
     * 主键
     */
    private Integer customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 状态，0删除，1正常
     */
    private Integer customerStatus;


}
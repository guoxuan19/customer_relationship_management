package com.qf.contract.common.qo;

import lombok.Data;


/**
    * 行业表
    */
@Data
public class IndustryQo {
    /**
     * 主键
     */
    private Integer industryId;

    /**
     * 行业名称
     */
    private String industryName;

    /**
     * 0删除，1正常
     */
    private Integer industryStatus;


}
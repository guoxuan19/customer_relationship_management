package com.qf.contract.common.qo;

import lombok.Data;


/**
    * 项目表
    */
@Data
public class ProgramQo {
    /**
     * 项目id
     */
    private Integer programId;

    /**
     * 项目名
     */
    private String programName;

    /**
     * 1正常，0删除
     */
    private Integer programStatus;

    /**
     * 客户id
     */
    private Integer customerId;
}
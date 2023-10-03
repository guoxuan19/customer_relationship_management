package com.qf.contract.common.qo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
    * 合同表
    */
@Data
public class ContractQo {
    /**
     * 主键
     */
    private Integer contractId;

    /**
     * 标题
     */
    private String title;

    /**
     * 商机id
     */
    private Integer businessOpportunityId;

    /**
     * 项目id
     */
    private Integer programId;

    /**
     * 总金额
     */
    private BigDecimal price;

    /**
     * 行业id
     */
    private Integer industryId;

    /**
     * 开始时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    /**
     * 合同状态，1未开始，2执行中，3结束，4意外结束
     */
    private Integer contractStatus;


    /**
     * 签约日期
     */
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date agencyTime;

    /**
     * 附件
     */
    private String fileLocation;

    /**
     * 备注
     */
    private String remark;

    /**
     * 跟进时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date followTime;

}
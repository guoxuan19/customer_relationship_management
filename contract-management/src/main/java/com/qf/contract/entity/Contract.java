package com.qf.contract.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 合同表
    */
@Data
@TableName(value = "t_contract")
public class Contract {
    /**
     * 主键
     */
    @TableId(value = "contract_id", type = IdType.INPUT)
    private Integer contractId;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 商机id
     */
    @TableField(value = "business_opportunity_id")
    private Integer businessOpportunityId;

    /**
     * 项目id
     */
    @TableField(value = "program_id")
    private Integer programId;

    /**
     * 总金额
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 行业id
     */
    @TableField(value = "industry_id")
    private Integer industryId;

    /**
     * 开始时间
     */
    @TableField(value = "start_time")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    private Date endTime;

    /**
     * 合同状态，1未开始，2执行中，3结束，4意外结束
     */
    @TableField(value = "contract_status")
    private Integer contractStatus;

    /**
     * 业务状态，0删除，1待提交，2待审核，3被驳回，4已审核
     */
    @TableField(value = "service_status")
    private Integer serviceStatus;

    /**
     * 签约日期
     */
    @TableField(value = "agency_time")
    private Date agencyTime;

    /**
     * 附件
     */
    @TableField(value = "file_location")
    private String fileLocation;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 跟进时间
     */
    @TableField(value = "follow_time")
    private Date followTime;

    public static final String COL_CONTRACT_ID = "contract_id";

    public static final String COL_TITLE = "title";

    public static final String COL_BUSINESS_OPPORTUNITY_ID = "business_opportunity_id";

    public static final String COL_PROGRAM_ID = "program_id";

    public static final String COL_PRICE = "price";

    public static final String COL_INDUSTRY_ID = "industry_id";

    public static final String COL_START_TIME = "start_time";

    public static final String COL_END_TIME = "end_time";

    public static final String COL_CONTRACT_STATUS = "contract_status";

    public static final String COL_SERVICE_STATUS = "service_status";

    public static final String COL_AGENCY_TIME = "agency_time";

    public static final String COL_FILE_LOCATION = "file_location";

    public static final String COL_REMARK = "remark";

    public static final String COL_FOLLOW_TIME = "follow_time";
}
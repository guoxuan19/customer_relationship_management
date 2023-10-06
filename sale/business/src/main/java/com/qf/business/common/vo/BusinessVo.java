package com.qf.business.common.vo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class BusinessVo {
    /**
     * 主键id
     */
    private Integer businessId;

    /**
     * 商机标题
     */
    private String businessTitle;

    /**
     * 对应客户
     */
    private Integer clientId;

    /**
     * 关联联系人
     */
    private Integer contactId;

    /**
     * 预计销售金额
     */
    private BigDecimal salesAmount;

    /**
     * 签单日期
     */
    private Date signingDate;

    /**
     * 销售阶段 1表示初步洽谈 2表示需求确定 3表示方案/报价 4表示谈判/合同  5表示赢单 6表示输单
     */
    private Integer salesPhase;

    /**
     * 关注度 1表示一般关注 2表示重点关注
     */
    private Integer businessAttention;

    /**
     * 关联产品
     */
    private Integer productId;

    /**
     * 下次跟进时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date followUpTime;

    /**
     * 备注
     */
    private String businessComment;

    /**
     * 项目联系人
     */
    private String projectContact;

    /**
     * 岗位
     */
    private String post;

    /**
     * 项目联系人电话
     */
    private String projectContactPhone;


    private ConsumerVo consumerVo;//关联客户表 一对一

    private ContactVo contactVo;//关联联系人 一对一

    private List<ProductVo> productVo;//关联产品  一对多

    private  List<FollowupRecordVo> followupRecordVo;//关联跟进信息  一对多
}


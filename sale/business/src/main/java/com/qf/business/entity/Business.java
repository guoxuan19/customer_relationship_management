package com.qf.business.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
    * 商机表
    */
@Data
@TableName(value = "t_business")
public class Business {
    /**
     * 主键id
     */
    @TableId(value = "business_id", type = IdType.INPUT)
    private Integer businessId;

    /**
     * 商机标题
     */
    @TableField(value = "business_title")
    private String businessTitle;

    /**
     * 对应客户
     */
    @TableField(value = "client_id")
    private Integer clientId;

    /**
     * 关联联系人
     */
    @TableField(value = "contact_id")
    private Integer contactId;

    /**
     * 预计销售金额
     */
    @TableField(value = "sales_amount")
    private BigDecimal salesAmount;

    /**
     * 签单日期
     */
    @TableField(value = "signing_date")
    private Date signingDate;

    /**
     * 销售阶段 1表示初步洽谈 2表示需求确定 3表示方案/报价 4表示谈判/合同  5表示赢单 6表示输单
     */
    @TableField(value = "sales_phase")
    private Integer salesPhase;

    /**
     * 关注度 1表示一般关注 2表示重点关注
     */
    @TableField(value = "business_attention")
    private Integer businessAttention;

    /**
     * 关联产品
     */
    @TableField(value = "product_id")
    private Integer productId;

    /**
     * 下次跟进时间
     */
    @TableField(value = "follow_up_time")
    private Date followUpTime;

    /**
     * 备注
     */
    @TableField(value = "business_comment")
    private String businessComment;

    /**
     * 项目联系人
     */
    @TableField(value = "project_contact")
    private String projectContact;

    /**
     * 岗位
     */
    @TableField(value = "post")
    private String post;

    /**
     * 项目联系人电话
     */
    @TableField(value = "project_contact_phone")
    private String projectContactPhone;

    public static final String COL_BUSINESS_ID = "business_id";

    public static final String COL_BUSINESS_TITLE = "business_title";

    public static final String COL_CLIENT_ID = "client_id";

    public static final String COL_CONTACT_ID = "contact_id";

    public static final String COL_SALES_AMOUNT = "sales_amount";

    public static final String COL_SIGNING_DATE = "signing_date";

    public static final String COL_SALES_PHASE = "sales_phase";

    public static final String COL_BUSINESS_ATTENTION = "business_attention";

    public static final String COL_PRODUCT_ID = "product_id";

    public static final String COL_FOLLOW_UP_TIME = "follow_up_time";

    public static final String COL_BUSINESS_COMMENT = "business_comment";

    public static final String COL_PROJECT_CONTACT = "project_contact";

    public static final String COL_POST = "post";

    public static final String COL_PROJECT_CONTACT_PHONE = "project_contact_phone";
}
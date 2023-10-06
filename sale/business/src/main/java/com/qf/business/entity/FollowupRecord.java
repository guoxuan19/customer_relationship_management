package com.qf.business.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 跟进记录
    */
@Data
@TableName(value = "t_followup_record")
public class FollowupRecord {
    /**
     * 主键id
     */
    @TableId(value = "followup_id", type = IdType.INPUT)
    private Integer followupId;

    /**
     * 跟进人/联系人id
     */
    @TableField(value = "contact_id")
    private Integer contactId;

    /**
     * 跟进方式
     */
    @TableField(value = "followup_method")
    private String followupMethod;

    /**
     * 填写时间/创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 实际跟进时间
     */
    @TableField(value = "actual_time")
    private Date actualTime;

    /**
     * 跟进内容
     */
    @TableField(value = "followup_content")
    private String followupContent;

    /**
     * 商机ID
     */
    @TableField(value = "business_id")
    private Integer businessId;

    public static final String COL_FOLLOWUP_ID = "followup_id";

    public static final String COL_CONTACT_ID = "contact_id";

    public static final String COL_FOLLOWUP_METHOD = "followup_method";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_ACTUAL_TIME = "actual_time";

    public static final String COL_FOLLOWUP_CONTENT = "followup_content";

    public static final String COL_BUSINESS_ID = "business_id";
}
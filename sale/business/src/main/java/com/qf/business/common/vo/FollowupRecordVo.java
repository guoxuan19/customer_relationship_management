package com.qf.business.common.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class FollowupRecordVo {
    /**
     * 主键id
     */
    private Integer followupId;

    /**
     * 跟进人/联系人id
     */
    private Integer contactId;

    /**
     * 跟进方式
     */
    private String followupMethod;

    /**
     * 填写时间/创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * 实际跟进时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date actualTime;

    /**
     * 跟进内容
     */
    private String followupContent;

    /**
     * 商机ID
     */
    private Integer businessId;
}


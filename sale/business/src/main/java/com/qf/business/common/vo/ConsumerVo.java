package com.qf.business.common.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class ConsumerVo {
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

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
}


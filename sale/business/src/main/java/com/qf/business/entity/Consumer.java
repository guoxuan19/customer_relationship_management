package com.qf.business.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Consumer {
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
    private Date createTime;
}


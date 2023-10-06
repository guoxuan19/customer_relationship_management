package com.qf.management.dto;

import lombok.Data;

import java.util.Date;

/**
 * 基础设置表
 */
@Data
public class BasicSettingDto {
    /**
     * 主键
     */
    private Integer basicSettingId;

    /**
     * 类型
     */
    private String type;

    /**
     * 值
     */
    private String value;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人Id
     */
    private Long createId;
}
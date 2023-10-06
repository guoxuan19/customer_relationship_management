package com.qf.management.dto;

import lombok.Data;

import java.util.Date;

/**
    * 常用术语表
    */
@Data
public class CommonTermsDto {
    /**
     * 主键
     */
    private Integer commonTermsId;

    /**
     * 常用术语
     */
    private String terminology;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人Id
     */
    private Long createId;
}
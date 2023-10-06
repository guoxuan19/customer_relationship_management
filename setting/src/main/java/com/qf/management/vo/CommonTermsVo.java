package com.qf.management.vo;

import com.qf.management.entity.User;
import lombok.Data;

import java.util.Date;

/**
    * 常用术语表
    */
@Data
public class CommonTermsVo {
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

    /**
     * 1表示正常，0表示删除
     */
    private Integer status;

    /**
     * 创建人
     */
    private User createUser;
}
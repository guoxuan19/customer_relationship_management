package com.qf.management.vo;

import com.qf.management.entity.User;
import lombok.Data;

import java.util.Date;

/**
    * 信息表
    */
@Data
public class MessageVo {
    /**
     * 主键
     */
    private Integer messageId;

    /**
     * 标题
     */
    private String title;

    /**
     * 0表示全部，其它的代表发布部门
     */
    private Integer scope;

    /**
     * 0表示删除，1表示待发布，2表示已发布
     */
    private Integer state;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人
     */
    private Long createId;

    /**
     * 发布人
     */
    private String publisher;

    /**
     * 创建人
     */
    private User createUser;
}
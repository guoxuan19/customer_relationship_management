package com.qf.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 信息表
    */
@Data
@TableName(value = "t_message")
public class Message {
    /**
     * 主键
     */
    @TableId(value = "message_id", type = IdType.INPUT)
    private Integer messageId;

    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 0表示全部，其它的代表发布部门
     */
    @TableField(value = "`scope`")
    private Integer scope;

    /**
     * 0表示删除，1表示待发布，2表示已发布
     */
    @TableField(value = "`state`")
    private Integer state;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @TableField(value = "create_id")
    private Long createId;

    /**
     * 发布人
     */
    @TableField(value = "publisher")
    private String publisher;

    public static final String COL_MESSAGE_ID = "message_id";

    public static final String COL_TITLE = "title";

    public static final String COL_SCOPE = "scope";

    public static final String COL_STATE = "state";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_ID = "create_id";

    public static final String COL_PUBLISHER = "publisher";
}
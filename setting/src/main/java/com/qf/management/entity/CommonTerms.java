package com.qf.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 常用术语表
    */
@Data
@TableName(value = "t_common_terms")
public class CommonTerms {
    /**
     * 主键
     */
    @TableId(value = "common_terms_id", type = IdType.INPUT)
    private Integer commonTermsId;

    /**
     * 常用术语
     */
    @TableField(value = "terminology")
    private String terminology;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 创建人Id
     */
    @TableField(value = "create_id")
    private Long createId;

    /**
     * 1表示正常，0表示删除
     */
    @TableField(value = "`status`")
    private Integer status;

    public static final String COL_COMMON_TERMS_ID = "common_terms_id";

    public static final String COL_TERMINOLOGY = "terminology";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CREATE_ID = "create_id";

    public static final String COL_STATUS = "status";
}
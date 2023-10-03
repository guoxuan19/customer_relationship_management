package com.qf.contract.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 行业表
    */
@Data
@TableName(value = "t_industry")
public class Industry {
    /**
     * 主键
     */
    @TableId(value = "industry_id", type = IdType.INPUT)
    private Integer industryId;

    /**
     * 行业名称
     */
    @TableField(value = "industry_name")
    private String industryName;

    /**
     * 0删除，1正常
     */
    @TableField(value = "industry_status")
    private Integer industryStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    public static final String COL_INDUSTRY_ID = "industry_id";

    public static final String COL_INDUSTRY_NAME = "industry_name";

    public static final String COL_INDUSTRY_STATUS = "industry_status";

    public static final String COL_CREATE_TIME = "create_time";
}
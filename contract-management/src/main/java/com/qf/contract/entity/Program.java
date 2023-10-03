package com.qf.contract.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
 * 项目表
 */
@Data
@TableName(value = "t_program00")
public class Program {
    /**
     * 项目id
     */
    @TableId(value = "program_id", type = IdType.INPUT)
    private Integer programId;

    /**
     * 项目名
     */
    @TableField(value = "program_name")
    private String programName;

    /**
     * 1正常，0删除
     */
    @TableField(value = "program_status")
    private Integer programStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 客户id
     */
    @TableField(value = "customer_id")
    private Integer customerId;

    public static final String COL_PROGRAM_ID = "program_id";

    public static final String COL_PROGRAM_NAME = "program_name";

    public static final String COL_PROGRAM_STATUS = "program_status";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_CUSTOMER_ID = "customer_id";
}
package com.qf.management.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 部门表
    */
@Data
@TableName(value = "t_dept")
public class Dept {
    /**
     * 主键id
     */
    @TableId(value = "dept_id", type = IdType.INPUT)
    private Integer deptId;

    /**
     * 部门名称
     */
    @TableField(value = "dept_name")
    private String deptName;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 状态 0表示禁用 1表示删除
     */
    @TableField(value = "dept_status")
    private Integer deptStatus;

    public static final String COL_DEPT_ID = "dept_id";

    public static final String COL_DEPT_NAME = "dept_name";

    public static final String COL_CREATE_TIME = "create_time";

    public static final String COL_DEPT_STATUS = "dept_status";
}
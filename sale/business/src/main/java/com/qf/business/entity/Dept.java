package com.qf.business.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Dept {
    /**
     * 主键id
     */
    private Integer deptId;

    /**
     * 部门名称
     */
    private String deptName;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 状态 0表示禁用 1表示删除
     */
    private Integer deptStatus;
}


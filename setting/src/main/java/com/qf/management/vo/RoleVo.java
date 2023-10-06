package com.qf.management.vo;

import lombok.Data;

import java.util.Date;

/**
    * 角色表
    */
@Data
public class RoleVo {
    /**
     * 主键
     */
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 创建时间
     */
    private Date createTime;
}
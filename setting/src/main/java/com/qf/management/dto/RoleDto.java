package com.qf.management.dto;

import lombok.Data;

import java.util.Date;

/**
    * 角色表
    */
@Data
public class RoleDto {
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

    /**
     * 1表示正常，0表示删除
     */
    private Integer status;
}
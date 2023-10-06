package com.qf.management.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
@Data
public class UserDto {
    /**
     * 主键
     */
    private Long userId;

    /**
     * 用户性名
     */
    private String name;

    /**
     * 用户登录账号名
     */
    private String userName;

    /**
     * 商城账号
     */
    private String mallAccount;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 角色Id
     */
    private Integer roleId;

    /**
     * 部门Id
     */
    private Integer departmentId;

    /**
     * 密码
     */
    private String password;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 1表示正常，0表示删除
     */
    private Integer status;
}

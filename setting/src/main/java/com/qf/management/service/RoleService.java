package com.qf.management.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.dto.RoleDto;
import com.qf.management.vo.RoleVo;

public interface RoleService {
    Page<RoleVo> queryRoleByPage(Integer page,Integer size);

    Integer addRole(RoleDto roleDto);

    Integer modifyRole(RoleDto roleDto);

    Integer deleteRole(Integer roleId);

    RoleVo queryById(Integer roleId);
}

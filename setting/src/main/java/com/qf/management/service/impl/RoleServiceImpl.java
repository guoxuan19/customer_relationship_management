package com.qf.management.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.base.exception.ServiceException;
import com.qf.common.base.resp.ResponseStatus;
import com.qf.common.base.utils.MyBeanUtils;
import com.qf.management.dto.RoleDto;
import com.qf.management.entity.Role;
import com.qf.management.mapper.RoleMapper;
import com.qf.management.service.RoleService;
import com.qf.management.vo.RoleVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    @Override
    public Page<RoleVo> queryRoleByPage(Integer page, Integer size) {
        return MyBeanUtils.copyList(roleMapper.selectPage(new Page<Role>(page,size),null),new Page<RoleVo>(),RoleVo::new);
    }

    @Override
    public Integer addRole(RoleDto roleDto) {
        int count = 0;
        count = roleMapper.insert(MyBeanUtils.copyBean(roleDto,Role::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.ROLE_INSERT_ERROR);
        }
        return count;
    }

    @Override
    public Integer modifyRole(RoleDto roleDto) {
        int count = 0;
        count = roleMapper.updateById(MyBeanUtils.copyBean(roleDto,Role::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.ROLE_UPDATE_ERROR);
        }
        return count;
    }

    @Override
    public Integer deleteRole(Integer roleId) {
        int count = 0;
        count = roleMapper.deleteById(roleId);
        if (count == 0){
            throw new ServiceException(ResponseStatus.ROLE_DELETE_ERROR);
        }
        return count;
    }

    @Override
    public RoleVo queryById(Integer roleId) {
        return MyBeanUtils.copyBean(roleMapper.selectById(roleId),RoleVo::new);
    }
}

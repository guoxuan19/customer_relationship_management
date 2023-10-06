package com.qf.management.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.exception.ServiceException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.management.dto.UserDto;
import com.qf.management.entity.User;
import com.qf.management.mapper.UserMapper;
import com.qf.management.service.UserService;
import com.qf.management.vo.UserVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public Page<UserVo> selectUserPage(Page<UserVo> page) {
        return page.setRecords(userMapper.selectUserByPage(page));
    }

    @Override
    public Integer addUser(UserDto userDto) {
        int count = 0;
        count = userMapper.insert(MyBeanUtils.copyBean(userDto,User::new));
        if (count <= 0){
            throw new ServiceException(ResponseStatus.USER_INSERT_ERROR);
        }
        return count;
    }

    @Override
    public Integer modifyUser(UserDto userDto) {
        int count = 0;
        count = userMapper.updateById(MyBeanUtils.copyBean(userDto,User::new));
        if (count <= 0){
            throw new ServiceException(ResponseStatus.USER_UPDATE_ERROR);
        }
        return count;
    }

    @Override
    public Integer deleteUser(Long userId) {
        int count = 0;
        count = userMapper.deleteById(userId);
        if (count <= 0){
            throw new ServiceException(ResponseStatus.USER_INSERT_ERROR);
        }
        return count;
    }

    @Override
    public UserVo queryUserById(Long userId) {
        return MyBeanUtils.copyBean(userMapper.selectById(userId),UserVo::new);
    }
}

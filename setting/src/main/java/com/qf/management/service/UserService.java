package com.qf.management.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.dto.UserDto;
import com.qf.management.vo.UserVo;

public interface UserService {
    Page<UserVo> selectUserPage(Page<UserVo> page);

    Integer addUser(UserDto userDto);

    Integer modifyUser(UserDto userDto);

    Integer deleteUser(Long userId);

    UserVo queryUserById(Long userId);
}

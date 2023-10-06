package com.qf.management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.entity.User;
import com.qf.management.vo.UserVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {
    List<UserVo> selectUserByPage(@Param("page") Page<UserVo> page);
}
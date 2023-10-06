package com.qf.management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.entity.Message;
import com.qf.management.vo.MessageVo;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper extends BaseMapper<Message> {
    Page<MessageVo> list(@Param("page") Page<MessageVo> page);
}
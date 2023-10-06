package com.qf.management.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.dto.MessageDto;
import com.qf.management.vo.MessageVo;

public interface MessageService {
    Page<MessageVo> list(Integer page,Integer size);

    Integer addMessage(MessageDto messageDto);

    Integer modifyMessage(MessageDto messageDto);

    Integer deleteMessage(Integer messageId);

    MessageVo queryById(Integer messageId);

    Integer publicMessage(Integer messageId);
}

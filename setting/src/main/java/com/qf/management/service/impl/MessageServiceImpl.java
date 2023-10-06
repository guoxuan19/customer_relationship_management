package com.qf.management.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.exception.ServiceException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.management.dto.MessageDto;
import com.qf.management.entity.Message;
import com.qf.management.mapper.MessageMapper;
import com.qf.management.service.MessageService;
import com.qf.management.vo.MessageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class MessageServiceImpl implements MessageService {
    @Resource
    private MessageMapper messageMapper;
    @Override
    public Page<MessageVo> list(Integer page, Integer size) {
        return messageMapper.list(new Page<>(page,size));
    }

    @Override
    public Integer addMessage(MessageDto messageDto) {
        int count = 0;
        count = messageMapper.insert(MyBeanUtils.copyBean(messageDto, Message::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.MESSAGE_INSERT_ERROR);
        }
        return count;
    }

    @Override
    public Integer modifyMessage(MessageDto messageDto) {
        int count = 0;
        count = messageMapper.updateById(MyBeanUtils.copyBean(messageDto, Message::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.MESSAGE_UPDATE_ERROR);
        }
        return count;
    }

    @Override
    public Integer deleteMessage(Integer messageId) {
        int count = 0;
        count = messageMapper.deleteById(messageId);
        if (count == 0){
            throw new ServiceException(ResponseStatus.MESSAGE_DELETE_ERROR);
        }
        return count;
    }

    @Override
    public MessageVo queryById(Integer messageId) {
        return MyBeanUtils.copyBean(messageMapper.selectById(messageId),MessageVo::new);
    }

    @Override
    public Integer publicMessage(Integer messageId) {
        Message message = messageMapper.selectById(messageId);
        message.setState(1);
        int count = 0;
        count = messageMapper.updateById(message);
        if (count == 0){
            throw new ServiceException(ResponseStatus.MESSAGE_UPDATE_ERROR);
        }
        return count;
    }
}

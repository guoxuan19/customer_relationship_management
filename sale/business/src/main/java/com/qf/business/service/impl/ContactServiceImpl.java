package com.qf.business.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.business.common.vo.ContactVo;
import com.qf.business.entity.Contact;
import com.qf.business.mapper.ContactMapper;
import com.qf.business.service.ContactService;
import com.qf.common.exception.ContactException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.List;


@Service
public class ContactServiceImpl implements ContactService {
    @Resource
    private ContactMapper contactMapper;


    @Override
    public PageInfo<ContactVo> getAllContact(Integer page,Integer size) {
        PageInfo<List<ContactVo>> contactVo = PageHelper.startPage(page, size).doSelectPageInfo(() -> contactMapper.list());

        if (ObjectUtils.isEmpty(contactVo)){
            throw new ContactException(ResponseStatus.NONE_DATA);
        }


        return MyBeanUtils.copyPage(contactVo, new PageInfo<>(), ContactVo::new);
    }
}

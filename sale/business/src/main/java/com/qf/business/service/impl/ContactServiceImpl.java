package com.qf.business.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.business.common.vo.ContactVo;
import com.qf.business.entity.Contact;
import com.qf.business.exception.BusinessException;
import com.qf.business.mapper.ContactMapper;
import com.qf.business.service.ContactService;
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
    public List<ContactVo> getAllContact() {
        List<Contact> contacts = contactMapper.selectList(null);
        if (ObjectUtils.isEmpty(contacts)){
            //
        }
        List<ContactVo> contactVos = MyBeanUtils.beanToList(contacts, ContactVo::new);
        return contactVos ;
    }
}

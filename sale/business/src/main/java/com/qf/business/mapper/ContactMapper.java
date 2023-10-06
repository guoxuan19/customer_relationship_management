package com.qf.business.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.business.common.vo.ContactVo;
import com.qf.business.entity.Contact;

import java.util.List;

public interface ContactMapper extends BaseMapper<Contact> {
    List<ContactVo> list();//查询所有联系人

}
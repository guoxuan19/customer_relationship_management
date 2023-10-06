package com.qf.business.service;



import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.qf.business.common.vo.ContactVo;

import java.util.List;

public interface ContactService {

    PageInfo<ContactVo> getAllContact(Integer page, Integer size);//查询所有联系人+分页


}

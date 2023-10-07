package com.qf.business.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.business.common.dto.BusinessDto;
import com.qf.business.common.vo.BusinessVo;
import com.qf.business.entity.Business;
import com.qf.business.entity.Consumer;
import com.qf.business.entity.Contact;
import com.qf.business.mapper.BusinessMapper;
import com.qf.business.mapper.ConsumerMapper;
import com.qf.business.mapper.ContactMapper;
import com.qf.business.service.BusinessService;
import com.qf.common.base.exception.BusinessOpportunityException;
import com.qf.common.base.resp.ResponseStatus;
import com.qf.common.base.utils.MyBeanUtils;

import com.qf.common.base.utils.PageUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;


import javax.annotation.Resource;
import java.util.List;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Resource
    private BusinessMapper businessMapper;
    @Resource
    private ConsumerMapper consumerMapper;
    @Resource
    private ContactMapper contactMapper;

    @Transactional(timeout = 5,rollbackFor = Exception.class)
    @Override
    public Integer addBusiness(BusinessDto businessDto) {
        //前端没有数据
        if (ObjectUtils.isEmpty(businessDto)){
            throw new BusinessOpportunityException(ResponseStatus.NONE_DATA);
        }

        //查询是商机标题否存在重复,存在则不添加
        QueryWrapper<Business> qw = new QueryWrapper<>();
        qw.eq(Business.COL_BUSINESS_TITLE,businessDto.getBusinessTitle());
        Business b = businessMapper.selectOne(qw);
        if (!ObjectUtils.isEmpty(b)){
            throw new BusinessOpportunityException(ResponseStatus.BUSINESS_EXISTED_ERROR);
        }

        Business business = MyBeanUtils.copyBean(businessDto, Business::new);
        int num = businessMapper.insert(business);
        //添加失败
        if (num == 0){
            throw new BusinessOpportunityException(ResponseStatus.BUSINESS_INSERT_ERROR);
        }
        return num;
    }

    @Override
    public PageUtils<BusinessVo> queryBusiness(BusinessDto businessDto) {
        //如果传递客户不为空先查询客户表id
        if (!ObjectUtils.isEmpty(businessDto.getCustomerName())){
            QueryWrapper<Consumer> qw = new QueryWrapper<>();
            qw.like(Consumer.COL_CUSTOMER_NAME,businessDto.getCustomerName());
            Consumer consumer = consumerMapper.selectOne(qw);
            businessDto.setClientId(consumer.getCustomerId());
        }

        //如果有传递关联联系人先查询联系人id
        if (!ObjectUtils.isEmpty(businessDto.getContactName())){

            QueryWrapper<Contact> queryWrapper = new QueryWrapper<>();
            queryWrapper.like(Contact.COL_CONTACT_NAME,businessDto.getContactName());
            Contact contact = contactMapper.selectOne(queryWrapper);
            businessDto.setContactId(contact.getContactId());
        }




        PageUtils<BusinessVo> page = new PageUtils<>();
        //设置当前页码
        page.setCurrentPage(businessDto.getPage());
        //设置页量
        page.setPageSize(businessDto.getSize());

        //计算开始索引
        businessDto.setPage((businessDto.getPage()-1)*businessDto.getSize());

        //查询记录数
        int totalPageCount = businessMapper.selectBusinessCount(businessDto);
        if (totalPageCount == 0){
            throw new BusinessOpportunityException(ResponseStatus.SYS_ERROR);
        }
        //设置总记录数
        page.setDataCount(totalPageCount);
        //设置总页码
        page.setPageCount(totalPageCount % businessDto.getSize() ==0 ?totalPageCount/businessDto.getSize() :totalPageCount/businessDto.getSize() +1);

        List<BusinessVo> businessVos = businessMapper.selectBusinessByPage(businessDto);
        if (ObjectUtils.isEmpty(businessVos)){
            throw new BusinessOpportunityException(ResponseStatus.SYS_ERROR);
        }

        //设置数据
        page.setData(businessVos);
        return page;
    }

}

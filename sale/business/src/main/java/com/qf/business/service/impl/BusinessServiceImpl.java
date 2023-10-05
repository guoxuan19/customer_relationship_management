package com.qf.business.service.impl;

import com.qf.business.common.dto.BusinessDto;
import com.qf.business.entity.Business;
import com.qf.business.exception.BusinessException;
import com.qf.business.mapper.BusinessMapper;
import com.qf.business.service.BusinessService;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Resource
    private BusinessMapper businessMapper;

    @Transactional(timeout = 5,rollbackFor = Exception.class)
    @Override
    public Integer addBusiness(BusinessDto businessDto) {
        if (ObjectUtils.isEmpty(businessDto)){
            throw new BusinessException(ResponseStatus.NONE_DATA);
        }
        Business business = MyBeanUtils.copyBean(businessDto, Business::new);
        int num = businessMapper.insert(business);

        if (num == 0){
            throw new BusinessException(ResponseStatus.BUSINESS_INSERT_ERROR);
        }
        return num;
    }


}

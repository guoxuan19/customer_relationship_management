package com.qf.contract.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.common.exception.BusinessOpportunityException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.contract.common.vo.BusinessOpportunityVo;
import com.qf.contract.entity.BusinessOpportunity;
import com.qf.contract.mapper.BusinessOpportunityMapper;
import com.qf.contract.service.BusinessOpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusinessOpportunityServiceImpl implements BusinessOpportunityService {
    @Autowired
    private BusinessOpportunityMapper businessOpportunityMapper;
    @Override
    public List<BusinessOpportunityVo> getBusinessOpportunities(Integer cid) {
        QueryWrapper<BusinessOpportunity> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(BusinessOpportunity.COL_CUSTOMER_ID,cid);
        List<BusinessOpportunity> businessOpportunities = businessOpportunityMapper.selectList(queryWrapper);
        if (businessOpportunities == null || businessOpportunities.size() == 0){
            throw new BusinessOpportunityException(ResponseStatus.NONE_DATA);
        }
        List<BusinessOpportunityVo> businessOpportunityVos = MyBeanUtils.beanToList(businessOpportunities, BusinessOpportunityVo::new);
        return businessOpportunityVos;
    }
}

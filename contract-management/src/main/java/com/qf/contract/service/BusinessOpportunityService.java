package com.qf.contract.service;

import com.qf.contract.common.vo.BusinessOpportunityVo;

import java.util.List;

public interface BusinessOpportunityService {
    List<BusinessOpportunityVo> getBusinessOpportunities(Integer cid);//查指定客户的所有商机
}

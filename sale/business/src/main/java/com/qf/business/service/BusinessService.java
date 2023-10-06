package com.qf.business.service;


import com.qf.business.common.dto.BusinessDto;
import com.qf.business.common.vo.BusinessVo;
import com.qf.common.utils.PageUtils;

public interface BusinessService {

    Integer addBusiness(BusinessDto businessDto);//新增商机

    PageUtils<BusinessVo> queryBusiness(BusinessDto businessDto);//商机查询-条件模糊查询+分页


}

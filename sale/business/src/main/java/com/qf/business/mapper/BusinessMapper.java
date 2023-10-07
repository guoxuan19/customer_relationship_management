package com.qf.business.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.business.common.dto.BusinessDto;
import com.qf.business.common.vo.BusinessVo;
import com.qf.business.entity.Business;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BusinessMapper extends BaseMapper<Business> {

    List<BusinessVo> selectBusinessByPage(@Param("business") BusinessDto businessDto);//查询商机+条件+分页

    int selectBusinessCount(@Param("business") BusinessDto businessDto);//根据条件查询记录数

}

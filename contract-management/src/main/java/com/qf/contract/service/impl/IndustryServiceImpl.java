package com.qf.contract.service.impl;

import com.qf.common.exception.IndustryException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.contract.common.vo.IndustryVo;
import com.qf.contract.entity.Industry;
import com.qf.contract.mapper.IndustryMapper;
import com.qf.contract.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndustryServiceImpl implements IndustryService {
    @Autowired
    private IndustryMapper industryMapper;
    @Override
    public List<IndustryVo> getAllIndustry() {
        List<Industry> industries = industryMapper.selectList(null);
        if (industries == null || industries.size() == 0){
            throw new IndustryException(ResponseStatus.INDUSTRY_NONE_DATA);
        }
        List<IndustryVo> industryVos = MyBeanUtils.beanToList(industries, IndustryVo::new);
        return industryVos;
    }
}

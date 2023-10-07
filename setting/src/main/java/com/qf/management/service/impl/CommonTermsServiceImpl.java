package com.qf.management.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.commons.base.exception.ServiceException;
import com.qf.commons.base.resp.ResponseStatus;
import com.qf.commons.base.utils.MyBeanUtils;
import com.qf.management.dto.CommonTermsDto;
import com.qf.management.entity.CommonTerms;
import com.qf.management.mapper.CommonTermsMapper;
import com.qf.management.service.CommonTermsService;
import com.qf.management.vo.CommonTermsVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CommonTermsServiceImpl implements CommonTermsService {
    @Resource
    private CommonTermsMapper commonTermsMapper;
    @Override
    public Page<CommonTermsVo> list(Integer page, Integer size) {
        return commonTermsMapper.list(new Page<>(page,size));
    }

    @Override
    public Integer addCommonTerms(CommonTermsDto commonTermsDto) {
        int count = 0;
        count = commonTermsMapper.insert(MyBeanUtils.copyBean(commonTermsDto, CommonTerms::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.COMMONTERMS_INSERT_ERROR);
        }
        return count;
    }

    @Override
    public Integer modifyCommonTerms(CommonTermsDto commonTermsDto) {
        int count = 0;
        count = commonTermsMapper.updateById(MyBeanUtils.copyBean(commonTermsDto, CommonTerms::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.COMMONTERMS_UPDATE_ERROR);
        }
        return count;
    }

    @Override
    public Integer deleteCommonTerms(Integer commonTermsId) {
        int count = 0;
        count = commonTermsMapper.deleteById(commonTermsId);
        if (count == 0){
            throw new ServiceException(ResponseStatus.COMMONTERMS_DELETE_ERROR);
        }
        return count;
    }

    @Override
    public CommonTermsVo queryCommonTerms(Integer commonTermsId) {
        return MyBeanUtils.copyBean(commonTermsMapper.selectById(commonTermsId),CommonTermsVo::new);
    }
}


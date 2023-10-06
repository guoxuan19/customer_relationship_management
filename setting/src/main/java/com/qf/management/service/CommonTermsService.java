package com.qf.management.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.dto.CommonTermsDto;
import com.qf.management.vo.CommonTermsVo;

public interface CommonTermsService {
    Page<CommonTermsVo> list(Integer page,Integer size);

    Integer addCommonTerms(CommonTermsDto commonTermsDto);

    Integer modifyCommonTerms(CommonTermsDto commonTermsDto);

    Integer deleteCommonTerms(Integer commonTermsId);

    CommonTermsVo queryCommonTerms(Integer commonTermsId);
}

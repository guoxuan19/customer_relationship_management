package com.qf.management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.entity.CommonTerms;
import com.qf.management.vo.CommonTermsVo;
import org.apache.ibatis.annotations.Param;

public interface CommonTermsMapper extends BaseMapper<CommonTerms> {
    Page<CommonTermsVo> list(@Param("page") Page<CommonTerms> page);
}
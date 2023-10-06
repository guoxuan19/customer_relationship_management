package com.qf.management.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.entity.BasicSetting;
import com.qf.management.vo.BasicSettingVo;
import org.apache.ibatis.annotations.Param;

public interface BasicSettingMapper extends BaseMapper<BasicSetting> {
    Page<BasicSettingVo> list(@Param("page") Page<BasicSettingVo> page);
}
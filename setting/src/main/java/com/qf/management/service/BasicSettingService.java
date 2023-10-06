package com.qf.management.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.management.dto.BasicSettingDto;
import com.qf.management.vo.BasicSettingVo;

public interface BasicSettingService {
    Page<BasicSettingVo> list(Integer page,Integer size);

    Integer addBasicSetting(BasicSettingDto basicSettingDto);

    Integer modifyBasicSetting(BasicSettingDto basicSettingDto);

    Integer deleteBasicSetting(Integer basicSettingId);

    BasicSettingVo queryById(Integer basicSettingId);
}

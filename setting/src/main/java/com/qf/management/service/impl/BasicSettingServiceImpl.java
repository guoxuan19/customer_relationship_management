package com.qf.management.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.base.exception.ServiceException;
import com.qf.common.base.resp.ResponseStatus;
import com.qf.common.base.utils.MyBeanUtils;
import com.qf.management.dto.BasicSettingDto;
import com.qf.management.entity.BasicSetting;
import com.qf.management.mapper.BasicSettingMapper;
import com.qf.management.service.BasicSettingService;
import com.qf.management.vo.BasicSettingVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BasicSettingServiceImpl implements BasicSettingService {
    @Resource
    private BasicSettingMapper basicSettingMapper;
    @Override
    public Page<BasicSettingVo> list(Integer page, Integer size) {
        Page<BasicSettingVo> iPage = new Page<>(page,size);
        return basicSettingMapper.list(iPage);
    }

    @Override
    public Integer addBasicSetting(BasicSettingDto basicSettingDto) {
        int count = 0;
        count = basicSettingMapper.insert(MyBeanUtils.copyBean(basicSettingDto,BasicSetting::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.BASICSETTING_INSERT_ERROR);
        }
        return count;
    }

    @Override
    public Integer modifyBasicSetting(BasicSettingDto basicSettingDto) {
        int count = 0;
        count = basicSettingMapper.updateById(MyBeanUtils.copyBean(basicSettingDto,BasicSetting::new));
        if (count == 0){
            throw new ServiceException(ResponseStatus.BASICSETTING_UPDATE_ERROR);
        }
        return count;
    }

    @Override
    public Integer deleteBasicSetting(Integer basicSettingId) {
        int count = 0;
        count = basicSettingMapper.deleteById(basicSettingId);
        if (count == 0){
            throw new ServiceException(ResponseStatus.BASICSETTING_DELETE_ERROR);
        }
        return count;
    }

    @Override
    public BasicSettingVo queryById(Integer basicSettingId) {
        return MyBeanUtils.copyBean(basicSettingMapper.selectById(basicSettingId),BasicSettingVo::new);
    }
}

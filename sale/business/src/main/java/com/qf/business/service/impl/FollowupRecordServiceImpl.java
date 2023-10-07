package com.qf.business.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qf.business.common.dto.FollowupRecordDto;
import com.qf.business.entity.FollowupRecord;
import com.qf.business.mapper.FollowupRecordMapper;
import com.qf.business.service.FollowupRecordService;
import com.qf.common.exception.BusinessOpportunityException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;

@Service
public class FollowupRecordServiceImpl implements FollowupRecordService {
    @Resource
    private FollowupRecordMapper followupRecordMapper;

    @Transactional(timeout = 10 , rollbackFor = Exception.class )
    @Override
    public Integer addFollowup(FollowupRecordDto followupRecordDto) {
        if (ObjectUtils.isEmpty(followupRecordDto)){
            throw new BusinessOpportunityException(ResponseStatus.NONE_DATA);
        }

        FollowupRecord followupRecord = MyBeanUtils.copyBean(followupRecordDto, FollowupRecord::new);
        int num = followupRecordMapper.insert(followupRecord);
        //回填跟进记录id
        Integer followupId = followupRecord.getFollowupId();
        if (num == 0){
            throw new BusinessOpportunityException(ResponseStatus.FOLLOWUP_INSERT_ERROR);
        }
        return num;
    }

}

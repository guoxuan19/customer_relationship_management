package com.qf.question.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.exception.OnlineHelpException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.question.common.qo.OnlineHelpQo;
import com.qf.question.common.vo.OnlineHelpVo;
import com.qf.question.entity.OnlineHelp;
import com.qf.question.mapper.OnlineHelpMapper;
import com.qf.question.service.OnlineHelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class OnlineHelpServiceImpl implements OnlineHelpService {
    @Autowired
    private OnlineHelpMapper onlineHelpMapper;
    @Override
    public Integer addOnlineHelp(OnlineHelpQo onlineHelpQo) {
        QueryWrapper<OnlineHelp> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(OnlineHelp.COL_ONLINE_HELP_NAME,onlineHelpQo.getOnlineHelpName()).or((q1)->{q1.eq(OnlineHelp.COL_FILE_LOCATION,onlineHelpQo.getFileLocation());});
        OnlineHelp o = onlineHelpMapper.selectOne(queryWrapper);
        if (o != null){
            throw new OnlineHelpException(ResponseStatus.ONLINE_HELP_NAME_EXIST);
        }
        OnlineHelp onlineHelp = MyBeanUtils.copyBean(onlineHelpQo, OnlineHelp::new);
        onlineHelp.setStatus(1);
        int num = onlineHelpMapper.insert(onlineHelp);
        if (num <= 0){
            throw new OnlineHelpException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    public Integer delOnlineHelp(List<Integer> ids) {
        Integer num = onlineHelpMapper.delOnlineHelp(ids);
        if (num != ids.size()){
            throw new OnlineHelpException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    public Integer modifyOnlineHelp(OnlineHelpQo onlineHelpQo) {
        QueryWrapper<OnlineHelp> queryWrapper = new QueryWrapper<>();
        queryWrapper.notIn(OnlineHelp.COL_ONLINE_HELP_ID,onlineHelpQo.getOnlineHelpId())
                .nested((q1)->{q1.eq(OnlineHelp.COL_ONLINE_HELP_NAME,onlineHelpQo.getOnlineHelpName()).or((q2)->{q2.eq(OnlineHelp.COL_FILE_LOCATION,onlineHelpQo.getFileLocation());});});
        OnlineHelp o = onlineHelpMapper.selectOne(queryWrapper);
        if (o != null){
            throw new OnlineHelpException(ResponseStatus.ONLINE_HELP_NAME_EXIST);
        }
        OnlineHelp onlineHelp = MyBeanUtils.copyBean(onlineHelpQo, OnlineHelp::new);
        int num = onlineHelpMapper.updateById(onlineHelp);
        if (num <= 0){
            throw new OnlineHelpException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    public Page<OnlineHelpVo> showOnlineHelpList(Long page, Long size, String name) {
        Page<OnlineHelp> p0 = new Page<>();
        p0.setSize(size);
        p0.setCurrent(page);
        QueryWrapper<OnlineHelp> queryWrapper = new QueryWrapper<>();
        if (!ObjectUtils.isEmpty(name)){
            queryWrapper.like(OnlineHelp.COL_ONLINE_HELP_NAME,name);
        }
        Page<OnlineHelp> onlineHelpPage = onlineHelpMapper.selectPage(p0, queryWrapper);
        Page<OnlineHelpVo> p = new Page<>();
        Page<OnlineHelpVo> onlineHelpVoPage = MyBeanUtils.copyList(onlineHelpPage, p, OnlineHelpVo::new);
        return onlineHelpVoPage;
    }

}

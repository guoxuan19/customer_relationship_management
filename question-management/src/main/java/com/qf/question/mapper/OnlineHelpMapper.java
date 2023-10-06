package com.qf.question.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.question.entity.OnlineHelp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OnlineHelpMapper extends BaseMapper<OnlineHelp> {
    Integer delOnlineHelp(@Param("list") List<Integer> ids);//删除/批量删除
}
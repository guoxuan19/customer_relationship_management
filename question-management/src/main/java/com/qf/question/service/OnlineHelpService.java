package com.qf.question.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.question.common.qo.OnlineHelpQo;
import com.qf.question.common.vo.OnlineHelpVo;

import java.util.List;

public interface OnlineHelpService {
    Integer addOnlineHelp(OnlineHelpQo onlineHelpQo);//添加在线帮助
    Integer delOnlineHelp(List<Integer> ids);//删除/批量删除
    Integer modifyOnlineHelp(OnlineHelpQo onlineHelpQo);//修改
    Page<OnlineHelpVo> showOnlineHelpList(Long page,Long size,String name);//分页+条件查询
}

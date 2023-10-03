package com.qf.contract.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qf.common.exception.ProgramException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.contract.common.vo.ProgramVo;
import com.qf.contract.entity.Program;
import com.qf.contract.mapper.ProgramMapper;
import com.qf.contract.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProgramServiceImpl implements ProgramService {
    @Autowired
    private ProgramMapper programMapper;
    @Override
    public List<ProgramVo> getPrograms(Integer cid) {
        QueryWrapper<Program> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Program.COL_CUSTOMER_ID,cid);
        List<Program> programs = programMapper.selectList(queryWrapper);
        if (programs == null || programs.size() == 0){
            throw new ProgramException(ResponseStatus.NONE_DATA);
        }
        List<ProgramVo> programVos = MyBeanUtils.beanToList(programs, ProgramVo::new);
        return programVos;
    }
}

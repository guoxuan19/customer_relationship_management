package com.qf.contract.service;

import com.qf.contract.common.vo.ProgramVo;

import java.util.List;

public interface ProgramService {
    List<ProgramVo> getPrograms(Integer cid);
}

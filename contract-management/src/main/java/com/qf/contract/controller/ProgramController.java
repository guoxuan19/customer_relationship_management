package com.qf.contract.controller;

import com.qf.common.base.resp.ResponseResult;
import com.qf.contract.common.vo.ProgramVo;
import com.qf.contract.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/program")
public class ProgramController {
    @Autowired
    private ProgramService programService;
    @GetMapping("/list")
    public ResponseResult<List<ProgramVo>> getPrograms(Integer cid){
        return ResponseResult.success(programService.getPrograms(cid));
    }
}

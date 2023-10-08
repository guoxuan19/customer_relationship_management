package com.qf.contract.controller;

import com.qf.common.base.resp.ResponseResult;
import com.qf.contract.common.vo.IndustryVo;
import com.qf.contract.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/industry")
public class IndustryController {
    @Autowired
    private IndustryService industryService;

    /**
     * 查所有行业
     * @return
     */
    @GetMapping("/list")
    public ResponseResult<List<IndustryVo>> getAllIndustry(){
        return ResponseResult.success(industryService.getAllIndustry());
    }
}

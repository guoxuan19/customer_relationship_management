package com.qf.contract.controller;

import com.qf.common.base.resp.ResponseResult;
import com.qf.contract.common.vo.BusinessOpportunityVo;
import com.qf.contract.service.BusinessOpportunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/business_opportunity")
public class BusinessOpportunityController {
    @Autowired
    private BusinessOpportunityService businessOpportunityService;

    @GetMapping("/list")
    public ResponseResult<List<BusinessOpportunityVo>> getBusinessOpportunities(Integer cid){
        return ResponseResult.success(businessOpportunityService.getBusinessOpportunities(cid));
    }
}

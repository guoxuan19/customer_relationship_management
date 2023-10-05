package com.qf.business.controller;

import com.qf.business.common.dto.BusinessDto;
import com.qf.business.service.BusinessService;
import com.qf.common.resp.ResponseResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sale/business")
public class businessController {

    @Resource
    private BusinessService businessService;


    @GetMapping("/hello")
    public String test(){
        return "hello";
    }

    /**
     * 新增商机
     * @param businessDto
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Integer> add(@RequestBody BusinessDto businessDto){
        return ResponseResult.success(businessService.addBusiness(businessDto));
    }

}

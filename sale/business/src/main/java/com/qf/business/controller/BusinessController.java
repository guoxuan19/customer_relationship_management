package com.qf.business.controller;

import com.qf.business.common.dto.BusinessDto;
import com.qf.business.common.vo.BusinessVo;
import com.qf.business.service.BusinessService;
import com.qf.common.base.resp.ResponseResult;
import com.qf.common.base.utils.PageUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sale/business")
public class BusinessController {

    @Resource
    private BusinessService businessService;

    /**
     * 新增商机
     * @param businessDto
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Integer> add(@RequestBody BusinessDto businessDto){
        return ResponseResult.success(businessService.addBusiness(businessDto));
    }

    /**
     * 商机模糊查询+分页
     * @param businessDto
     * @return
     */
    @PostMapping("/list")
    public ResponseResult<PageUtils<BusinessVo>> list(@RequestBody(required = false) BusinessDto businessDto){
        return ResponseResult.success(businessService.queryBusiness(businessDto));
    }

}

package com.qf.management.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.base.resp.ResponseResult;
import com.qf.management.dto.CommonTermsDto;
import com.qf.management.service.CommonTermsService;
import com.qf.management.vo.CommonTermsVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/commonTerms")
public class CommonTermsController {
    @Resource
    private CommonTermsService commonTermsService;

    @GetMapping("/list")
    public ResponseResult<Page<CommonTermsVo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size){
        return ResponseResult.success(commonTermsService.list(page,size));
    }
    @PostMapping("/add")
    public ResponseResult<Integer> addCommonTerms(@RequestBody CommonTermsDto commonTermsDto){
        return ResponseResult.success(commonTermsService.addCommonTerms(commonTermsDto));
    }

    @PutMapping("/modify")
    public ResponseResult<Integer> modifyCommonTerms(@RequestBody CommonTermsDto commonTermsDto){
        return ResponseResult.success(commonTermsService.modifyCommonTerms(commonTermsDto));
    }

    @DeleteMapping("/delete/{commonTermsId}")
    public ResponseResult<Integer> deleteCommonTerms(@PathVariable Integer commonTermsId){
        return ResponseResult.success(commonTermsService.deleteCommonTerms(commonTermsId));
    }

    @GetMapping("/query/{commonTermsId}")
    public ResponseResult<CommonTermsVo> query(@PathVariable Integer commonTermsId){
        return ResponseResult.success(commonTermsService.queryCommonTerms(commonTermsId));
    }
}

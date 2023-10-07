package com.qf.management.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.base.resp.ResponseResult;
import com.qf.management.dto.BasicSettingDto;
import com.qf.management.service.BasicSettingService;
import com.qf.management.vo.BasicSettingVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/basicSetting")
public class BasicSettingController {

    @Resource
    private BasicSettingService basicSettingService;

    @GetMapping("/list")
    public ResponseResult<Page<BasicSettingVo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size){
        return ResponseResult.success(basicSettingService.list(page,size));
    }

    @PostMapping("/add")
    public ResponseResult<Integer> addUser(@RequestBody BasicSettingDto basicSettingDto){
        return ResponseResult.success(basicSettingService.addBasicSetting(basicSettingDto));
    }

    @PutMapping("/modify")
    public ResponseResult<Integer> modifyUser(@RequestBody BasicSettingDto basicSettingDto){
        return ResponseResult.success(basicSettingService.modifyBasicSetting(basicSettingDto));
    }

    @DeleteMapping("/delete/{basicSettingId}")
    public ResponseResult<Integer> deleteUser(@PathVariable Integer basicSettingId){
        return ResponseResult.success(basicSettingService.deleteBasicSetting(basicSettingId));
    }

    @GetMapping("/query/{basicSettingId}")
    public ResponseResult<BasicSettingVo> query(@PathVariable Integer basicSettingId){
        return ResponseResult.success(basicSettingService.queryById(basicSettingId));
    }

}

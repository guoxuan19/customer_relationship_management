package com.qf.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.qf.commons.base.resp.ResponseResult;


@RestController
@RequestMapping("/api")
public class TestController {
    @GetMapping("/test")
    public ResponseResult<String> test(){
        return ResponseResult.success("成功");
    }
}

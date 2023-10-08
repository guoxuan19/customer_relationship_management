package com.qf.contract.controller;

import com.qf.common.base.resp.ResponseResult;
import com.qf.contract.common.vo.CustomerVo;
import com.qf.contract.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/list")
    public ResponseResult<List<CustomerVo>> getAllCustomer(){
        return ResponseResult.success(customerService.getAllCustomer());
    }
}

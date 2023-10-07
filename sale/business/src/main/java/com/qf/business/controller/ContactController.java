package com.qf.business.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;
import com.qf.business.common.vo.ContactVo;
import com.qf.business.service.ContactService;
import com.qf.common.base.resp.ResponseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sale/contact")
public class ContactController {
    @Resource
    private ContactService contactService;


    /**
     * 查询所有联系人+分页
     * @return
     */
    @GetMapping("/list")
    public ResponseResult<PageInfo<ContactVo>> list(@RequestParam(defaultValue = "1",required = false)Integer page,
                                                    @RequestParam(defaultValue = "5",required = false)Integer size) {
        return ResponseResult.success(contactService.getAllContact(page,size));
    }


}

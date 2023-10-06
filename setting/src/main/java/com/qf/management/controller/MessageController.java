package com.qf.management.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.resp.ResponseResult;
import com.qf.management.dto.MessageDto;
import com.qf.management.service.MessageService;
import com.qf.management.vo.MessageVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/message")
public class MessageController {
    @Resource
    private MessageService messageService;

    @GetMapping("/list")
    public ResponseResult<Page<MessageVo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size){
        return ResponseResult.success(messageService.list(page,size));
    }
    @PostMapping("/add")
    public ResponseResult<Integer> addMessage(@RequestBody MessageDto messageDto){
        return ResponseResult.success(messageService.addMessage(messageDto));
    }

    @PutMapping("/modify")
    public ResponseResult<Integer> modifyMessage(@RequestBody MessageDto messageDto){
        return ResponseResult.success(messageService.modifyMessage(messageDto));
    }

    @DeleteMapping("/delete/{messageId}")
    public ResponseResult<Integer> deleteMessage(@PathVariable Integer messageId){
        return ResponseResult.success(messageService.deleteMessage(messageId));
    }

    @GetMapping("/query/{messageId}")
    public ResponseResult<MessageVo> query(@PathVariable Integer messageId){
        return ResponseResult.success(messageService.queryById(messageId));
    }

    @PutMapping("/public/{messageId}")
    public ResponseResult<Integer> publicMessage(@PathVariable Integer messageId){
        return ResponseResult.success(messageService.publicMessage(messageId));
    }
}

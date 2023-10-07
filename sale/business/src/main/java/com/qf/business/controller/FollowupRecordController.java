package com.qf.business.controller;

import com.qf.business.common.dto.FollowupRecordDto;
import com.qf.business.service.FollowupRecordService;
import com.qf.common.resp.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/business/followup")
public class FollowupRecordController {
    @Resource
    private FollowupRecordService followupRecordService;

    /**
     * 添加跟进记录
     * @param followupRecordDto
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Integer> add(@RequestBody FollowupRecordDto followupRecordDto){
        return ResponseResult.success(followupRecordService.addFollowup(followupRecordDto));
    }


}

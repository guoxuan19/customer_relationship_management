package com.qf.question.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.resp.ResponseResult;
import com.qf.question.common.qo.OnlineHelpQo;
import com.qf.question.common.vo.OnlineHelpVo;
import com.qf.question.service.OnlineHelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/online/help")
public class OnlineHelpController {
    @Autowired
    private OnlineHelpService onlineHelpService;

    /**
     * 添加数据
     * @param onlineHelpQo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Integer> addOnlineHelp(@RequestBody OnlineHelpQo onlineHelpQo){
        return ResponseResult.success(onlineHelpService.addOnlineHelp(onlineHelpQo));
    }

    /**
     * 删除/批量删除
     * @param ids
     * @return
     */
    @DeleteMapping("/del")
    public ResponseResult<Integer> delOnlineHelp(@RequestBody List<Integer> ids){
        return ResponseResult.success(onlineHelpService.delOnlineHelp(ids));
    }

    /**
     * 修改
     * @param onlineHelpQo
     * @return
     */
    @PutMapping("/update")
    public ResponseResult<Integer> modifyOnlineHelp(@RequestBody OnlineHelpQo onlineHelpQo){
        return ResponseResult.success(onlineHelpService.modifyOnlineHelp(onlineHelpQo));
    }

    /**
     * 分页+条件查询
     * @param page
     * @param size
     * @param name
     * @return
     */
    @GetMapping("/list")
    public ResponseResult<Page<OnlineHelpVo>> showOnlineHelpList(@RequestParam(defaultValue = "1") Long page,@RequestParam(defaultValue = "2") Long size,String name){
        return ResponseResult.success(onlineHelpService.showOnlineHelpList(page, size, name));
    }
}

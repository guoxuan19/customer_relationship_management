package com.qf.management.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.commons.base.resp.ResponseResult;
import com.qf.management.dto.UserDto;
import com.qf.management.service.UserService;
import com.qf.management.vo.UserVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/list")
    public ResponseResult<Page<UserVo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size){
        Page<UserVo> iPage = new Page(page,size);
        return ResponseResult.success(userService.selectUserPage(iPage));
    }

    @PostMapping("/add")
    public ResponseResult<Integer> addUser(@RequestBody UserDto userDto){
        return ResponseResult.success(userService.addUser(userDto));
    }

    @PutMapping("/modify")
    public ResponseResult<Integer> modifyUser(@RequestBody UserDto userDto){
        return ResponseResult.success(userService.modifyUser(userDto));
    }

    @DeleteMapping("/delete/{userId}")
    public ResponseResult<Integer> deleteUser(@PathVariable Long userId){
        return ResponseResult.success(userService.deleteUser(userId));
    }

    @GetMapping("/query/{userId}")
    public ResponseResult<UserVo> query(@PathVariable Long userId){
        return ResponseResult.success(userService.queryUserById(userId));
    }

}

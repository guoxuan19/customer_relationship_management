package com.qf.management.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.commons.base.resp.ResponseResult;
import com.qf.management.dto.RoleDto;
import com.qf.management.service.RoleService;
import com.qf.management.vo.RoleVo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleService roleService;

    @GetMapping("/list")
    public ResponseResult<Page<RoleVo>> list(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10")Integer size){
        return ResponseResult.success(roleService.queryRoleByPage(page,size));
    }

    @PostMapping("/add")
    public ResponseResult<Integer> addUaddRoleser(@RequestBody RoleDto roleDto){
        return ResponseResult.success(roleService.addRole(roleDto));
    }

    @PutMapping("/modify")
    public ResponseResult<Integer> modifyRole(@RequestBody RoleDto roleDto){
        return ResponseResult.success(roleService.modifyRole(roleDto));
    }

    @DeleteMapping("/delete/{roleId}")
    public ResponseResult<Integer> deleteRole(@PathVariable Integer roleId){
        return ResponseResult.success(roleService.deleteRole(roleId));
    }

    @GetMapping("/query/{roleId}")
    public ResponseResult<RoleVo> query(@PathVariable Integer roleId){
        return ResponseResult.success(roleService.queryById(roleId));
    }
}

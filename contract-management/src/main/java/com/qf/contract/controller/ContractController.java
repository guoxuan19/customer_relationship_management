package com.qf.contract.controller;

import com.qf.common.base.resp.ResponseResult;
import com.qf.common.base.utils.PageUtils;
import com.qf.contract.common.qo.ContractQo;
import com.qf.contract.common.qo.QueryWrapperOfContract;
import com.qf.contract.common.vo.ContractVo;
import com.qf.contract.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractController {
    @Autowired
    private ContractService contractService;

    /**
     * 保存合同
     * @param contractQo
     * @return
     */
    @PostMapping("/store")
    public ResponseResult<Integer> storeContract(@RequestBody ContractQo contractQo){
        return ResponseResult.success(contractService.addContract(1,contractQo));
    }

    /**
     * 提交合同
     * @param contractQo
     * @return
     */
    @PostMapping("/up")
    public ResponseResult<Integer> upContract(@RequestBody ContractQo contractQo){
        return ResponseResult.success(contractService.addContract(2,contractQo));
    }

    /**
     * 查看合同详情
     * @param cid
     * @return
     */
    @GetMapping("/detail")
    public ResponseResult<ContractVo> getContractById(Integer cid){
        return ResponseResult.success(contractService.getContractById(cid));
    }

    /**
     * 编辑并保存合同——只有待提交和被驳回的合同才能编辑
     * @param contractQo
     * @return
     */
    @PutMapping("/update/store")
    public ResponseResult<Integer> updateAndStoreContract(@RequestBody ContractQo contractQo){
        return ResponseResult.success(contractService.modifyContract(1,contractQo));
    }

    /**
     * 编辑并提交合同
     * @param contractQo
     * @return
     */
    @PutMapping("/update/up")
    public ResponseResult<Integer> updateAndUpContract(@RequestBody ContractQo contractQo){
        return ResponseResult.success(contractService.modifyContract(2,contractQo));
    }

    /**
     * 保存->提交合同
     * @param cid
     * @return
     */
    @PutMapping("/toup")
    public ResponseResult<Integer> toUpContract(Integer cid){
        return ResponseResult.success(contractService.modifyContract(2,cid));
    }

    /**
     * 提交->审核通过
     * @param cid
     * @return
     */
    @PutMapping("/pass")
    public ResponseResult<Integer> passContract(Integer cid){
        return ResponseResult.success(contractService.modifyContract(4,cid));
    }

    /**
     * 驳回合同
     * @param cid
     * @return
     */
    @PutMapping("/reject")
    public ResponseResult<Integer> rejectContract(Integer cid){
        return ResponseResult.success(contractService.modifyContract(3,cid));
    }

    /**
     * 删除/批量删除合同
     * @param ids
     * @return
     */
    @DeleteMapping("/del")
    public ResponseResult<Integer> delContract(@RequestBody List<Integer> ids){
        return ResponseResult.success(contractService.delContract(ids));
    }
    @GetMapping("/list")
    public ResponseResult<PageUtils<ContractVo>> getContractByPage(@RequestParam(defaultValue = "1")Integer page, @RequestParam(defaultValue = "2") Integer size, @RequestBody QueryWrapperOfContract queryWrapperOfContract){
        return ResponseResult.success(contractService.getContractByPage(page, size, queryWrapperOfContract));
    }
}

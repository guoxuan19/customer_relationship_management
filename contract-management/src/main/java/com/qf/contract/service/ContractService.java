package com.qf.contract.service;

import com.qf.common.base.utils.PageUtils;
import com.qf.contract.common.qo.ContractQo;
import com.qf.contract.common.qo.QueryWrapperOfContract;
import com.qf.contract.common.vo.ContractVo;

import java.util.List;

public interface ContractService {
    Integer addContract(Integer status, ContractQo contractQo);//保存/提交合同
    ContractVo getContractById(Integer cid);//查看合同详情
    Integer modifyContract(Integer status,ContractQo contractQo);//编辑合同
    Integer modifyContract(Integer status,Integer cid);//保存->提交合同
    Integer delContract(List<Integer> ids);//删除合同
    PageUtils<ContractVo> getContractByPage(Integer page, Integer size, QueryWrapperOfContract queryWrapperOfContract);//分页+条件查询
}

package com.qf.contract.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.contract.common.qo.QueryWrapperOfContract;
import com.qf.contract.common.vo.ContractVo;
import com.qf.contract.entity.Contract;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ContractMapper extends BaseMapper<Contract> {
    Integer updateContract(@Param("status") Integer status,@Param("cid") Integer contract_id);//提交/审核/驳回合同
    Integer delContract(@Param("list")List<Integer> ids);//批量删除/删除合同
    Integer selectContractCount(@Param("query") QueryWrapperOfContract queryWrapperOfContract);//根据条件查总数目
    List<ContractVo> selectContractByPage(@Param("page") Integer page,@Param("size") Integer size,@Param("query") QueryWrapperOfContract queryWrapperOfContract);//条件+分页查询
}
package com.qf.contract.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.exception.ContractException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.common.utils.PageUtils;
import com.qf.contract.common.qo.ContractQo;
import com.qf.contract.common.qo.QueryWrapperOfContract;
import com.qf.contract.common.vo.ContractVo;
import com.qf.contract.entity.Contract;
import com.qf.contract.mapper.ContractMapper;
import com.qf.contract.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    private ContractMapper contractMapper;
    @Transactional(timeout = 10,rollbackFor = RuntimeException.class)
    @Override
    public Integer addContract(Integer status, ContractQo contractQo) {
        QueryWrapper<Contract> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Contract.COL_TITLE,contractQo.getTitle())
                .or((q1)->{q1.eq(Contract.COL_BUSINESS_OPPORTUNITY_ID,contractQo.getBusinessOpportunityId()).or((q2)->{
            q2.eq(Contract.COL_PROGRAM_ID,contractQo.getContractId());
        });});
        Contract c = contractMapper.selectOne(queryWrapper);
        if (c != null){
            throw new ContractException(ResponseStatus.CONTRACT_HAS_EXIST);
        }
        Contract contract = MyBeanUtils.copyBean(contractQo, Contract::new);
        contract.setServiceStatus(status);
        Integer num = contractMapper.insert(contract);
        if (num <= 0){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    public ContractVo getContractById(Integer cid) {
        Contract contract = contractMapper.selectById(cid);
        if (contract == null){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        ContractVo contractVo = MyBeanUtils.copyBean(contract, ContractVo::new);
        return contractVo;
    }

    @Override
    @Transactional(timeout = 10,rollbackFor = RuntimeException.class)
    public Integer modifyContract(Integer status,ContractQo contractQo) {
        Contract c1 = contractMapper.selectById(contractQo.getContractId());
        if (c1 == null){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        if (c1.getServiceStatus() != 1 && c1.getServiceStatus() != 3){
            throw new ContractException(ResponseStatus.CONTRACT_ILLEGA_UPDATE);
        }
        QueryWrapper<Contract> queryWrapper = new QueryWrapper<>();
        queryWrapper.nested((q0)->{q0.eq(Contract.COL_TITLE,contractQo.getTitle())
                .or((q1)->{q1.eq(Contract.COL_BUSINESS_OPPORTUNITY_ID,contractQo.getBusinessOpportunityId()).or((q2)->{
                    q2.eq(Contract.COL_PROGRAM_ID,contractQo.getContractId());
                });});}).and((q3)->{q3.notIn(Contract.COL_CONTRACT_ID,contractQo.getContractId());});
        Contract c2 = contractMapper.selectOne(queryWrapper);
        if (c2 != null){
            throw new ContractException(ResponseStatus.CONTRACT_HAS_EXIST);
        }
        Contract contract = MyBeanUtils.copyBean(contractQo, Contract::new);
        contract.setServiceStatus(status);
        int num = contractMapper.updateById(contract);
        if (num <= 0){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    @Transactional(timeout = 10,rollbackFor = RuntimeException.class)
    public Integer modifyContract(Integer status,Integer cid) {
        QueryWrapper<Contract> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Contract.COL_CONTRACT_ID,cid);
        Contract contract = contractMapper.selectOne(queryWrapper);
        if (contract.getServiceStatus() != 1 && contract.getServiceStatus() != 2 ){
            throw new ContractException(ResponseStatus.CONTRACT_ILLEGA_UPDATE);
        }
        if (contract.getServiceStatus() == 1 && (status == 3 || status == 4)){
            throw new ContractException(ResponseStatus.CONTRACT_ILLEGA_UPDATE);
        }
        if (contract.getServiceStatus() == 2 && status == 1){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        Integer num = contractMapper.updateContract(status, cid);
        if (num <= 0){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    @Transactional(timeout = 10,rollbackFor = RuntimeException.class)
    public Integer delContract(List<Integer> ids) {
        Integer num = contractMapper.delContract(ids);
        if (num != ids.size()){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    public PageUtils<ContractVo> getContractByPage(Integer page, Integer size, QueryWrapperOfContract queryWrapperOfContract) {
        PageUtils<ContractVo> pageUtils = new PageUtils<>();
        pageUtils.setCurrentPage(page);
        pageUtils.setPageSize(size);
        Integer num = contractMapper.selectContractCount(queryWrapperOfContract);
        if (num == 0){
            throw new ContractException(ResponseStatus.NONE_DATA);
        }
        pageUtils.setDataCount(num);
        pageUtils.setPageCount(num%size == 0 ? num/size : num/size+1);
        List<ContractVo> contractVos = contractMapper.selectContractByPage(page, size, queryWrapperOfContract);
        if (contractVos == null || contractVos.size() == 0){
            throw new ContractException(ResponseStatus.SYS_ERROR);
        }
        pageUtils.setData(contractVos);
        return pageUtils;
    }

}

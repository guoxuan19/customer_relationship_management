package com.qf.contract.service.impl;

import com.qf.common.exception.CustomerException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.contract.common.vo.CustomerVo;
import com.qf.contract.entity.Customer;
import com.qf.contract.mapper.CustomerMapper;
import com.qf.contract.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;
    @Override
    public List<CustomerVo> getAllCustomer() {
        List<Customer> customers = customerMapper.selectList(null);
        if (customers == null || customers.size() == 0){
            throw new CustomerException(ResponseStatus.NONE_DATA);
        }
        List<CustomerVo> customerVos = MyBeanUtils.beanToList(customers, CustomerVo::new);
        return customerVos;
    }
}

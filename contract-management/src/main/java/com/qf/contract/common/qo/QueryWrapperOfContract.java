package com.qf.contract.common.qo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class QueryWrapperOfContract {
    private String title;//合同标题
    private Integer contractId;//合同id
    private String customerName;//客户名称
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startTime;//合同起始时间
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;//合同结束时间
}

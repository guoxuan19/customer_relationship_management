package com.qf.common.base.exception;


import com.qf.common.base.resp.ResponseStatus;

public class BusinessOpportunityException extends BaseException{

    public BusinessOpportunityException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class BusinessOpportunityException extends BaseException{

    public BusinessOpportunityException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

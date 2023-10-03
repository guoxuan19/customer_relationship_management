package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class ContractException extends BaseException{
    public ContractException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

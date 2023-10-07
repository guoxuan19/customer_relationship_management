package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

public class ContractException extends BaseException{
    public ContractException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

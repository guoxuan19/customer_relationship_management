package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class CustomerException extends BaseException{

    public CustomerException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

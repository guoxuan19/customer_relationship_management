package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

public class CustomerException extends BaseException {

    public CustomerException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

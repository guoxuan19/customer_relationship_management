package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

public class IndustryException extends BaseException{
    public IndustryException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

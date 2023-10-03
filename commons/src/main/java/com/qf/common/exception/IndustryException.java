package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class IndustryException extends BaseException{
    public IndustryException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

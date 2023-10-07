package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

public class ContactException extends BaseException{
    public ContactException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

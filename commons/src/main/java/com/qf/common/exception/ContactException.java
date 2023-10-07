package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class ContactException extends BaseException{
    public ContactException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

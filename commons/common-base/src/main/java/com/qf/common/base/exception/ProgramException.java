package com.qf.common.base.exception;

import com.qf.common.base.resp.ResponseStatus;

public class ProgramException extends BaseException{
    public ProgramException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

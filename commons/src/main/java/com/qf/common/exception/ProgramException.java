package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class ProgramException extends BaseException{
    public ProgramException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

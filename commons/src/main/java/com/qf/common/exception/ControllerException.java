package com.qf.common.exception;


import com.qf.common.resp.ResponseStatus;

public class ControllerException extends BaseException{

    public ControllerException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

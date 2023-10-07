package com.qf.commons.base.exception;


import com.qf.commons.base.resp.ResponseStatus;

public class ControllerException extends BaseException{

    public ControllerException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

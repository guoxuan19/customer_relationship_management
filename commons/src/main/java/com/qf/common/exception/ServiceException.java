package com.qf.common.exception;


import com.qf.common.resp.ResponseStatus;

public class ServiceException extends BaseException{

    public ServiceException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

package com.qf.commons.base.exception;


import com.qf.commons.base.resp.ResponseStatus;

public class ServiceException extends BaseException{

    public ServiceException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

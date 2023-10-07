package com.qf.commons.base.exception;


import com.qf.commons.base.resp.ResponseStatus;

public class DaoException extends BaseException{

    public DaoException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

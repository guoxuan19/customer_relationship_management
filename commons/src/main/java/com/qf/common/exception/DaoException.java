package com.qf.common.exception;


import com.qf.common.resp.ResponseStatus;

public class DaoException extends BaseException{

    public DaoException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

package com.qf.common.base.exception;


import com.qf.common.base.resp.ResponseStatus;

public class DaoException extends BaseException {

    public DaoException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

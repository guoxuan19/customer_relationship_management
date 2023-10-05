package com.qf.business.exception;

import com.qf.common.exception.BaseException;
import com.qf.common.resp.ResponseStatus;

public class BusinessException extends BaseException {
    public BusinessException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

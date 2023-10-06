package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class OnlineHelpException extends BaseException{
    public OnlineHelpException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

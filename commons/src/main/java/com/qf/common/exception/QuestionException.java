package com.qf.common.exception;

import com.qf.common.resp.ResponseStatus;

public class QuestionException extends BaseException{
    public QuestionException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

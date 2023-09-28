package com.qf.common.exception;


import com.qf.common.resp.ResponseStatus;

public class InstitutionException extends BaseException{

    public InstitutionException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

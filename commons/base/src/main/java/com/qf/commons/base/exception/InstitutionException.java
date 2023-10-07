package com.qf.commons.base.exception;


import com.qf.commons.base.resp.ResponseStatus;

public class InstitutionException extends BaseException{

    public InstitutionException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

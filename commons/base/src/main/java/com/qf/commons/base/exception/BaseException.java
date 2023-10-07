package com.qf.commons.base.exception;


import com.qf.commons.base.resp.ResponseStatus;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final ResponseStatus responseStatus;

    public BaseException(ResponseStatus responseStatus){
        this.responseStatus = responseStatus;
        super.printStackTrace();
    }
}

package com.qf.common.exception;


import com.qf.common.resp.ResponseStatus;
import lombok.Getter;

@Getter
public class BaseException extends RuntimeException{
    private final ResponseStatus responseStatus;

    public BaseException(ResponseStatus responseStatus){
        this.responseStatus = responseStatus;
        super.printStackTrace();
    }
}

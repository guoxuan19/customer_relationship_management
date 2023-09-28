package com.qf.common.exception;


import com.qf.common.resp.ResponseStatus;

public class EquipmentException extends BaseException{
    public EquipmentException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

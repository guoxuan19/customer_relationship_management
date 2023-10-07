package com.qf.commons.base.exception;


import com.qf.commons.base.resp.ResponseStatus;

public class EquipmentException extends BaseException{
    public EquipmentException(ResponseStatus responseStatus) {
        super(responseStatus);
    }
}

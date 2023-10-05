package com.qf.common.resp;

import lombok.Getter;

@Getter
public enum ResponseStatus {
    SUCCESS(200,"成功"),
    SYS_ERROR(400,"系统错误"),
    NONE_DATA(4100,"没有数据"),
    BUSINESS_INSERT_ERROR(4301,"商机添加失败")
    ;

    private Integer code;
    private String message;

    ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

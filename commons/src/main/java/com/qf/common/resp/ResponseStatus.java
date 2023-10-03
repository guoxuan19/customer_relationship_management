package com.qf.common.resp;

import lombok.Getter;

@Getter
public enum ResponseStatus {
    SUCCESS(200,"成功"),
    SYS_ERROR(400,"系统错误"),

    NONE_DATA(4100,"没有数据"),
    CONTRACT_HAS_EXIST(4200,"合同标题或商机或项目重复"),
    CONTRACT_ILLEGA_UPDATE(4201,"非法编辑")
    ;

    private Integer code;
    private String message;

    ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

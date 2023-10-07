package com.qf.common.resp;

import lombok.Getter;

@Getter
public enum ResponseStatus {
    SUCCESS(200,"成功"),
    SYS_ERROR(400,"系统错误"),

    NONE_DATA(4100,"没有数据"),
    CONTRACT_HAS_EXIST(4200,"合同标题或商机或项目重复"),
    CONTRACT_ILLEGA_UPDATE(4201,"非法编辑"),

    BUSINESS_INSERT_ERROR(4301,"商机添加失败"),
    BUSINESS_EXISTED_ERROR(4302,"商机已经存在"),
    FOLLOWUP_INSERT_ERROR(4305,"跟进记录添加失败"),


    USER_INSERT_ERROR(40500,"用户插入失败"),
    USER_UPDATE_ERROR(40501,"用户更新失败"),
    USER_DELETE_ERROR(40502,"用户删除失败"),
    BASICSETTING_INSERT_ERROR(405003,"基础设置插入失败"),
    BASICSETTING_UPDATE_ERROR(405004,"基础设置更新失败"),
    BASICSETTING_DELETE_ERROR(405005,"基础设置删除失败"),
    ROLE_INSERT_ERROR(405006,"角色插入失败"),
    ROLE_UPDATE_ERROR(405007,"角色更新失败"),
    ROLE_DELETE_ERROR(405008,"角色删除失败"),
    MESSAGE_INSERT_ERROR(405009,"信息插入失败"),
    MESSAGE_UPDATE_ERROR(405010,"信息更新失败"),
    MESSAGE_DELETE_ERROR(405011,"信息删除失败"),
    COMMONTERMS_INSERT_ERROR(405012,"常用术语插入失败"),
    COMMONTERMS_UPDATE_ERROR(405013,"常用术语更新失败"),
    COMMONTERMS_DELETE_ERROR(405014,"常用术语删除失败"),
    ;

    private Integer code;
    private String message;

    ResponseStatus(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}

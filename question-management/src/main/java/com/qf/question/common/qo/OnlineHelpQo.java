package com.qf.question.common.qo;

import lombok.Data;

/**
    * 在线帮助表
    */
@Data
public class OnlineHelpQo {
    /**
     * 主键
     */
    private Integer onlineHelpId;

    /**
     * 名称
     */
    private String onlineHelpName;

    /**
     * 描述
     */
    private String description;

    /**
     * 标签
     */
    private String tags;

    /**
     * 文件路径
     */
    private String fileLocation;


}
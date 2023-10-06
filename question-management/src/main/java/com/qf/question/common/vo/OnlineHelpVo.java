package com.qf.question.common.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 在线帮助表
    */
@Data
@TableName(value = "t_online_help")
public class OnlineHelpVo {
    /**
     * 主键
     */
    @TableId(value = "online_help_id", type = IdType.INPUT)
    private Integer onlineHelpId;

    /**
     * 名称
     */
    @TableField(value = "online_help_name")
    private String onlineHelpName;

    /**
     * 描述
     */
    @TableField(value = "description")
    private String description;

    /**
     * 标签
     */
    @TableField(value = "tags")
    private String tags;

    /**
     * 文件路径
     */
    @TableField(value = "file_location")
    private String fileLocation;


}
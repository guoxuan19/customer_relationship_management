package com.qf.question.entity;

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
public class OnlineHelp {
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

    /**
     * 状态，0删除，1正常
     */
    @TableField(value = "`status`")
    private Integer status;

    public static final String COL_ONLINE_HELP_ID = "online_help_id";

    public static final String COL_ONLINE_HELP_NAME = "online_help_name";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_TAGS = "tags";

    public static final String COL_FILE_LOCATION = "file_location";

    public static final String COL_STATUS = "status";
}
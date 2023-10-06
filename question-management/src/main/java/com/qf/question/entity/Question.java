package com.qf.question.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 问题表
    */
@Data
@TableName(value = "t_question")
public class Question {
    /**
     * 主键
     */
    @TableId(value = "question_id", type = IdType.INPUT)
    private Integer questionId;

    /**
     * 问题描述
     */
    @TableField(value = "question_desc")
    private String questionDesc;

    /**
     * 答案
     */
    @TableField(value = "answer")
    private String answer;

    /**
     * 状态，0删除，1正常
     */
    @TableField(value = "`status`")
    private Integer status;

    public static final String COL_QUESTION_ID = "question_id";

    public static final String COL_QUESTION_DESC = "question_desc";

    public static final String COL_ANSWER = "answer";

    public static final String COL_STATUS = "status";
}
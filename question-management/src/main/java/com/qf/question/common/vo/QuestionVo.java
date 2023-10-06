package com.qf.question.common.vo;

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
public class QuestionVo {
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



}
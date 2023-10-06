package com.qf.question.common.qo;


import lombok.Data;

/**
    * 问题表
    */
@Data
public class QuestionQo {
    /**
     * 主键
     */
    private Integer questionId;

    /**
     * 问题描述
     */
    private String questionDesc;

    /**
     * 答案
     */
    private String answer;


}
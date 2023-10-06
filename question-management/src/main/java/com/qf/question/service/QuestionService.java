package com.qf.question.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.question.common.qo.QuestionQo;
import com.qf.question.common.vo.QuestionVo;

import java.util.List;

public interface QuestionService {
    Integer addQuestion(QuestionQo questionQo);
    Integer delQuestion(List<Integer> ids);
    Integer modifyQuestion(QuestionQo questionQo);
    Page<QuestionVo> showQuestionList(Long page,Long size,String name);
}

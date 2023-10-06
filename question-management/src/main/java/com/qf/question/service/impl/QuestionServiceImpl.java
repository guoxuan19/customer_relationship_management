package com.qf.question.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.exception.QuestionException;
import com.qf.common.resp.ResponseStatus;
import com.qf.common.utils.MyBeanUtils;
import com.qf.question.common.qo.QuestionQo;
import com.qf.question.common.vo.QuestionVo;
import com.qf.question.entity.Question;
import com.qf.question.mapper.QuestionMapper;
import com.qf.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper questionMapper;
    @Override
    @Transactional(timeout = 10,rollbackFor = RuntimeException.class)
    public Integer addQuestion(QuestionQo questionQo) {
        QueryWrapper<Question> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(Question.COL_QUESTION_DESC,questionQo.getQuestionDesc());
        Question q = questionMapper.selectOne(queryWrapper);
        if (q != null){
            throw new QuestionException(ResponseStatus.QUESTION_EXIST);
        }
        Question question = MyBeanUtils.copyBean(questionQo, Question::new);
        question.setStatus(1);
        int num = questionMapper.insert(question);
        if (num <= 0){
            throw new QuestionException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    @Transactional(timeout = 10,rollbackFor = RuntimeException.class)
    public Integer delQuestion(List<Integer> ids) {
        Integer num = questionMapper.delQuestion(ids);
        if (num != ids.size()){
            throw new QuestionException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    @Transactional(timeout = 10,rollbackFor = RuntimeException.class)
    public Integer modifyQuestion(QuestionQo questionQo) {
        QueryWrapper<Question> queryWrapper = new QueryWrapper<>();
        queryWrapper.notIn(Question.COL_QUESTION_ID,questionQo.getQuestionId()).
                eq(Question.COL_QUESTION_DESC,questionQo.getQuestionDesc());
        Question q = questionMapper.selectOne(queryWrapper);
        if (q != null){
            throw new QuestionException(ResponseStatus.QUESTION_EXIST);
        }
        Question question = MyBeanUtils.copyBean(questionQo, Question::new);
        int num = questionMapper.updateById(question);
        if (num <= 0){
            throw new QuestionException(ResponseStatus.SYS_ERROR);
        }
        return num;
    }

    @Override
    public Page<QuestionVo> showQuestionList(Long page, Long size, String name) {
        Page<Question> p0 = new Page<>();
        p0.setCurrent(page);
        p0.setSize(size);
        QueryWrapper<Question> queryWrapper = new QueryWrapper<>();
        if (!ObjectUtils.isEmpty(name)){
            queryWrapper.like(Question.COL_QUESTION_DESC,name);
        }
        Page<Question> questionPage = questionMapper.selectPage(p0, queryWrapper);
        if (questionPage == null){
            throw new QuestionException(ResponseStatus.SYS_ERROR);
        }
        Page<QuestionVo> p = new Page<>();
        Page<QuestionVo> questionVoPage = MyBeanUtils.copyList(questionPage, p, QuestionVo::new);
        return questionVoPage;
    }
}

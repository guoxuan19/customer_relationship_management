package com.qf.question.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qf.question.entity.Question;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QuestionMapper extends BaseMapper<Question> {
    Integer delQuestion(@Param("list") List<Integer> ids);
}
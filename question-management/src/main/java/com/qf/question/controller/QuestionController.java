package com.qf.question.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qf.common.resp.ResponseResult;
import com.qf.question.common.qo.QuestionQo;
import com.qf.question.common.vo.QuestionVo;
import com.qf.question.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    /**
     * 添加数据
     * @param questionQo
     * @return
     */
    @PostMapping("/add")
    public ResponseResult<Integer> addQuestion(@RequestBody QuestionQo questionQo){
        return ResponseResult.success(questionService.addQuestion(questionQo));
    }

    /**
     * 删除shuju
     * @param ids
     * @return
     */
    @DeleteMapping("/del")
    public ResponseResult<Integer> delQuestion(@RequestBody List<Integer> ids){
        return ResponseResult.success(questionService.delQuestion(ids));
    }

    /**
     * 修改
     * @param questionQo
     * @return
     */
    @PutMapping("/update")
    public ResponseResult<Integer> modifyQuestion(@RequestBody QuestionQo questionQo){
        return ResponseResult.success(questionService.modifyQuestion(questionQo));
    }

    /**
     * 分页+条件查询
     * @param page
     * @param size
     * @param name
     * @return
     */
    @GetMapping("/list")
    public ResponseResult<Page<QuestionVo>> showQuestionList(@RequestParam(defaultValue = "1") Long page,@RequestParam(defaultValue = "2") Long size,String name){
        return ResponseResult.success(questionService.showQuestionList(page, size, name));
    }
}

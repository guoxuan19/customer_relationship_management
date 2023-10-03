package com.qf.contract.common.handler;

import com.qf.common.exception.BaseException;
import com.qf.common.resp.ResponseResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理：
 * 1.拦截Controller层所有的方法，对其进行异常通知增强（在类上使用注解@RestControllerAdvice 或者 @ControllerAdvice）
 * 2.公开的方法上声明需要处理的异常
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseResult<Object> exceptionHandler(Exception e){
        e.printStackTrace();
        return ResponseResult.error();
    }

    @ExceptionHandler(BaseException.class)
    public ResponseResult<Object> baseExceptionHandler(BaseException baseException){
        baseException.printStackTrace();
        return ResponseResult.error(baseException.getResponseStatus());
    }
}

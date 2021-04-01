package com.henanuniversity.wangqi.exception.handler;

import com.henanuniversity.wangqi.entity.ResultEntity;
import com.henanuniversity.wangqi.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Title: GlobalExceptionHandler
 * @Description: 异常统一处理类
 * @date 2020/8/8 11:56
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /**
     * 服务抛出异常.
     *
     * @param request  request
     * @param e        exception
     * @param response response
     * @return 响应结果
     */
    @ExceptionHandler(BaseException.class)
    public String baseExceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        log.error("请求({}), 方法({}) 发生异常", request.getRequestURI(), request.getMethod(), e);
        response.setStatus(HttpStatus.OK.value());
        BaseException exception = (BaseException) e;
        return ResultEntity.error(exception);
    }

    /**
     * 方法不存在
     * @param request request
     * @param e 异常
     * @param response response
     * @return 错误信息
     */
    @ExceptionHandler(NoHandlerFoundException.class)
    public String noHandlerFoundExceptionHandler(HttpServletRequest request,
                                                 final Exception e, HttpServletResponse response) {
        log.error("请求({}), 方法({}) 发生异常", request.getRequestURI(), request.getMethod(), e);
        response.setStatus(HttpStatus.NOT_FOUND.value());
        return ResultEntity.error("404", request.getRequestURI() + " not found");
    }
    /**
     * body参数有误
     * @param request request
     * @param e 异常
     * @param response response
     * @return 错误信息
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public String httpMessageNotReadableExceptionHandler(HttpServletRequest request, final Exception e,
                                                         HttpServletResponse response) {
        response.setStatus(HttpStatus.OK.value());
        log.error("请求({}), 方法({}) 发生异常", request.getRequestURI(), request.getMethod(), e);
        return ResultEntity.error("1009", "body参数有误");
    }

    /**
     * 所有异常
     * @param request request
     * @param e 异常
     * @param response response
     * @return 错误信息
     */
    @ExceptionHandler(Exception.class)
    public String exceptionHandler(HttpServletRequest request, final Exception e, HttpServletResponse response) {
        response.setStatus(HttpStatus.OK.value());
        log.error("请求({}), 方法({}) 发生异常", request.getRequestURI(), request.getMethod(), e);
        return ResultEntity.error("1000", "系统开小差了，请稍后再试");
    }
}

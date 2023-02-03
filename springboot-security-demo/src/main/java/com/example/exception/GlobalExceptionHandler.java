package com.example.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author yuanyao
 * @Date 2022/9/13
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final String DEFAULT_ERROR_VIEW = "error";

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception.class)
    public ModelAndView defaultExceptionHandler(HttpServletRequest request, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        mv.addObject("url", request.getRequestURL());
        mv.setViewName(DEFAULT_ERROR_VIEW);
        return mv;
    }

    @ExceptionHandler(MyException.class)
    public ErrorInfo<String> json() {
        ErrorInfo<String> errorInfo = new ErrorInfo<>();
        errorInfo.setData("have exception");
        return errorInfo;
    }

//    @ExceptionHandler(MyException.class)
//    public ModelAndView html(HttpServletRequest request,Exception e){
//        ModelAndView error = new ModelAndView("error");
//        error.addObject("exception", e);
//        error.addObject("url", request.getRequestURL());
//        return error;
//    }
}

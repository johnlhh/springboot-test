package com.smartzhe.app.exception;

import com.smartzhe.app.response.ApiResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by luohuahua on 17/10/8.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {BizException.class, Exception.class})
    @ResponseBody
    public ApiResponse defaultExceptionHandler(HttpServletRequest req, Exception e) throws Exception {

        if (e instanceof BizException) {
            return ApiResponse.fail((BizException) e);
        } else {
            return ApiResponse.fail(400, e.getMessage());
        }

    }


}

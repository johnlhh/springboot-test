package com.smartzhe.app.response;

import com.smartzhe.app.exception.BizException;

/**
 * Created by luohuahua on 17/10/8.
 */
public class ApiResponse<T> {

    private Integer code;

    private String reason;

    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }


    public static <T> ApiResponse<T> success(T t){
        ApiResponse response = new ApiResponse();
        response.setCode(0);
        response.setData(t);
        response.setReason("success");
        return response;
    }

    public static  ApiResponse fail(BizException e){
        ApiResponse response = new ApiResponse();
        response.setCode(e.getBizExceptionType().getCode());
        response.setReason(e.getBizExceptionType().getMessage());
        return response;
    }

    public static  ApiResponse fail(Integer code,String message){
        ApiResponse response = new ApiResponse();
        response.setCode(code);
        response.setReason(message);
        return response;
    }


}

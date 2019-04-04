package com.yhr.dubbo.one.api.response;

import com.yhr.dubbo.one.api.enums.StatusCode;

import java.io.Serializable;

/**
 * @BelongsProject: dubboOne
 * @BelongsPackage: com.yhr.dubbo.one.api.response
 * @Author: yang
 * @CreateTime: 2019-04-04 09:17
 * @Description: ${Description}
 */
public class BaseResponse<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;


    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(StatusCode statuscode){
        this.code=statuscode.getCode();
        this.msg=statuscode.getMsg();
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

package com.yhr.dubbo.one.api.enums;

/**
 * @BelongsProject: dubboOne
 * @BelongsPackage: com.yhr.dubbo.one.api.enums
 * @Author: yang
 * @CreateTime: 2019-04-04 09:19
 * @Description: ${Description}
 */
public enum StatusCode {


    Success(0,"成功"),
    Fail(-1,"失败"),
    InvalidParams(200,"无效的参数"),
    ItemNotExist(201,"商品不存在!");

    private Integer code;
    private String msg;

    StatusCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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

}

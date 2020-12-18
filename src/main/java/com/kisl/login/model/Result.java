package com.kisl.login.model;

/**
 * Created by Administrator on 2020/3/1.
 * 向前端返回信息封装
 * @param <T> 可变类型.
 * @author keyan
 */
public class Result<T>  {
    /**
     * 返回信息
     */
    private String msg;

    /**
     * 数据是否正常请求
     */
    private boolean success;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getDetail() {
        return detail;
    }

    public void setDetail(T detail) {
        this.detail = detail;
    }

    /**
     * 具体返回的数据
     */
    private T detail;
}

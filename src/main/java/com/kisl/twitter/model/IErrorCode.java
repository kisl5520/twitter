package com.kisl.twitter.model;

/**
 * 封装API的错误码
 * Created by Administrator on 2021/1/6.
 */
public interface IErrorCode {
    long getCode();

    String getMessage();
}

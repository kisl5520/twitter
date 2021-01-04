package com.kisl.twitter.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2020/3/1.
 * 向前端返回信息封装
 * @param <T> 可变类型.
 * @author keyan
 */
@ApiModel(description = "接口返回结果通用Entity")
@Data
public class Result<T>  implements Serializable {
    /**
     * 返回信息
     */
    @ApiModelProperty(value = "返回信息", name = "msg", required = true, example = "返回信息")
    private String msg;

    /**
     * 接口调用是否正常
     */
    @ApiModelProperty(value = "接口调用是否正常", name = "success", required = true, example = "true")
    private boolean success;

    /**
     * 具体返回的数据
     */
    @ApiModelProperty(value = "接口具体返回的数据", name = "data", required = true)
    private T data;
}

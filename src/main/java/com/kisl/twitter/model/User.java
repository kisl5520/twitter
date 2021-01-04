package com.kisl.twitter.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * Created by Administrator on 2020/3/1.
 * @author keyan
 */
@ApiModel(description = "用户Entity")
@Data
public class User implements Serializable {
    @ApiModelProperty(value = "用户id", name = "id",hidden=true)
    private Long id;

    @ApiModelProperty(value = "用户名称", name = "username", required = true, example = "ky")
    private String username;

    @ApiModelProperty(value = "用户密码", name = "password", required = true, example = "1")
    private String password;
}


package com.kisl.twitter.dto;/**
 * Created by Administrator on 2021/1/7.
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NonNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2021/1/7 21:49
 * @Version 1.0.0
 */
@Data
public class UmsAdminLoginParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NonNull
    private String username;
    @ApiModelProperty(value = "密码", required = true)
    @NonNull
    private String password;
}

package com.kisl.twitter.controller;

import com.kisl.twitter.model.Result;
import com.kisl.twitter.model.User;
import com.kisl.twitter.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(value="UserController相关的api",tags={"用户操作接口"})
/**
 * @author keyan.
 */
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/regist")
    @ApiOperation(value="用户注册",notes="用户注册")
    public Result regist(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true) User user){
        return userService.regist(user);
    }

    /**
     * 登录
     * @param user 参数封装
     * @return Result
     */
    @PostMapping(value = "/login")
    @ApiOperation(value="用户登录",notes="用户登录")
    public Result login(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true) User user){
        return userService.login(user);
    }
}


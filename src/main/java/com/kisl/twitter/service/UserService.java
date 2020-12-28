package com.kisl.twitter.service;

import com.kisl.twitter.mapper.UserMapper;
import com.kisl.twitter.model.Result;
import com.kisl.twitter.model.User;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = RuntimeException.class)
@Slf4j
/**
 * @author keyan.
 */
public class UserService {

    @Autowired
    private UserMapper userMapper;
    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    public Result<Object> regist(User user) {
        final Result<Object> result = new Result<Object>();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            User existUser = userMapper.findUserByName(user.getUsername());
            if(existUser != null){
                //如果用户名已存在
                result.setMsg("用户名已存在");
                log.info("用户名已存在");
            }else{
                userMapper.regist(user);
                log.info("用户唯一id："+user.getId().toString());
                result.setMsg("注册成功");
                result.setSuccess(true);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 登录
     * @param user 用户名和密码
     * @return Result
     */
    public Result<Object> login(User user) {
        Result<Object> result = new Result<Object>();
        result.setSuccess(false);
        result.setDetail(null);
        try {
            Long userId= userMapper.login(user);
            if(userId == null){
                log.info("登录失败，用户名或密码错误。");
                result.setMsg("用户名或密码错误。");
            }else{
                log.info("登录成功");
                result.setMsg("登录成功");
                result.setSuccess(true);
                user.setId(userId);
                result.setDetail(user);
            }
        } catch (Exception e) {
            result.setMsg(e.getMessage());
            e.printStackTrace();
        }
        return result;
    }
}

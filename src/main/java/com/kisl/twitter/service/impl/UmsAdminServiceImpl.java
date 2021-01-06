package com.kisl.twitter.service.impl;/**
 * Created by Administrator on 2021/1/6.
 */

import com.kisl.twitter.mbg.mapper.UmsAdminMapper;
import com.kisl.twitter.mbg.model.UmsAdmin;
import com.kisl.twitter.mbg.model.UmsAdminExample;
import com.kisl.twitter.mbg.model.UmsPermission;
import com.kisl.twitter.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author keyan
 * @Descrition TODO
 * @Date 2021/1/6 23:29
 * @Version 1.0.0
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

    @Autowired
    private UmsAdminMapper adminMapper;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<UmsAdmin> adminList = adminMapper.selectByExample(example);
        if (adminList != null && adminList.size() > 0) {
            return adminList.get(0);
        }
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdmin umsAdminParam) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public List<UmsPermission> getPermissionList(Long adminId) {
        return null;
    }
}

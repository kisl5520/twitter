package com.kisl.twitter.dao;/**
 * Created by Administrator on 2021/1/7.
 */

import com.kisl.twitter.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author keyan
 * @Descrition 后台用户与角色管理自定义Dao
 * @Date 2021/1/7 20:50
 * @Version 1.0.0
 */
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}

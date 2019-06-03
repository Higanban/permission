package com.chen.service;

import com.chen.dto.RoleDto;
import com.chen.pojo.UserInfo;
import com.chen.vo.UserRole;

import java.util.List;

public interface UserInfoService {

    UserInfo findUserInfo(UserInfo userInfo);

    List<UserInfo> findAllUserInfo();

    UserInfo findUserInfoById(int userId);

    int updateUserInfoById(UserInfo userInfo);

    int addUserInfo(UserInfo userInfo);

    int deleteUserInfoByUserId(int userId);

    List<UserInfo> findUserInfoByCondition(String condition);

    List<RoleDto> findRoleDto(int userId);

    int updateUserRoleInfo(UserRole userRole);

    int insertUserRoleInfo(UserRole userRole);

    int  registerUser(UserInfo userInfo);

}

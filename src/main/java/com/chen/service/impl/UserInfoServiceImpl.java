package com.chen.service.impl;

import com.chen.dto.RoleDto;
import com.chen.mapper.UserInfoMapper;
import com.chen.pojo.UserInfo;
import com.chen.service.UserInfoService;
import com.chen.vo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    UserInfoMapper userInfoMapper;

    @Transactional(propagation = Propagation.SUPPORTS)
    public UserInfo findUserInfo(UserInfo userInfo) {
        return userInfoMapper.findUserInfo(userInfo);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<UserInfo> findAllUserInfo() {
        return userInfoMapper.findAllUserInfo();
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public UserInfo findUserInfoById(int userId) {
        return userInfoMapper.findUserInfoById(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int updateUserInfoById(UserInfo userInfo) {
        return userInfoMapper.updateUserInfoById(userInfo);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int addUserInfo(UserInfo userInfo) {
        return userInfoMapper.addUserInfo(userInfo);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int deleteUserInfoByUserId(int userId) {
        return userInfoMapper.deleteUserInfoByUserId(userId);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<UserInfo> findUserInfoByCondition(String condition) {
        return userInfoMapper.findUserInfoByCondition(condition);
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public List<RoleDto> findRoleDto(int userId) {
        return userInfoMapper.findRoleDto(userId);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int updateUserRoleInfo(UserRole userRole) {
        return userInfoMapper.updateUserRoleInfo(userRole);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public int insertUserRoleInfo(UserRole userRole) {
        return userInfoMapper.insertUserRoleInfo(userRole);
    }

    public int registerUser(UserInfo userInfo) {
        return userInfoMapper.registerUser(userInfo);
    }

}

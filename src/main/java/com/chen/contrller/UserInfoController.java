package com.chen.contrller;

import com.chen.pojo.UserInfo;
import com.chen.service.UserInfoService;
import com.chen.tool.MD5Utils;
import com.chen.vo.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;

    //登录
    @RequestMapping("loginController")
    public Object login(@RequestBody UserInfo userInfo, HttpSession httpSession ) {
        userInfo.setPassword(MD5Utils.myEncode(userInfo.getPassword()));
        UserInfo userInfo1 = userInfoService.findUserInfo(userInfo);
        if(userInfo1!=null) {
            httpSession.setAttribute("userInfo",userInfo1);
            return true;
        }else {
            return false;
        }

    }
    //查找所有用户
    @RequestMapping("listAllUserInfo")
    public Object findAllUserInfo() {
       return userInfoService.findAllUserInfo();
    }

    //信息回显，根据用户查找用户信息
    @RequestMapping("getUserInfoById")
    public Object findUsrById(@RequestParam int userId) {
        return userInfoService.findUserInfoById(userId);
    }

    //修个用户信息
    @RequestMapping("updateUserInfoById")
    public Object updateUserInfoById(@RequestBody UserInfo userInfo) {
        return userInfoService.updateUserInfoById(userInfo);
    }
    //新增用户
    @RequestMapping("addUserInfo")
    public Object addUserInfo(@RequestBody UserInfo userInfo) {
        return userInfoService.addUserInfo(userInfo);
    }

    //根据userId删除用户
    @RequestMapping("deleteUserInfoByUserId")
    public Object deleteUserInfoByUserId(@RequestParam int userId) {
        return userInfoService.deleteUserInfoByUserId(userId);
    }

    //模糊查询
    @RequestMapping("findUserInfoByCondition")
    public Object findUserInfoByCondition(@RequestParam String condition) {
        System.out.println(condition);
        return userInfoService.findUserInfoByCondition(condition);
    }

    //根据用户id查询角色
    @RequestMapping("listRoleDto")
    public Object listRoleDto(@RequestParam int userId) {
        return userInfoService.findRoleDto(userId);
    }

    @RequestMapping("deleteUserRoleInfo")
    public Object updateUserRoleInfo(@RequestBody UserRole userRole) {
        return userInfoService.updateUserRoleInfo(userRole);
    }

    @RequestMapping("insertUserRoleInfo")
    public Object insertUserRoleInfo(@RequestBody UserRole userRole) {
        return userInfoService.insertUserRoleInfo(userRole);
    }
    //注册
    @RequestMapping("registerUser")
    public Object registerUser(@RequestBody UserInfo userInfo) {
        userInfo.setPassword(MD5Utils.myEncode(userInfo.getPassword()));
        return userInfoService.registerUser(userInfo);
    }
}

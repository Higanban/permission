package com.chen.contrller;

import com.chen.pojo.UserInfo;
import com.chen.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class MenuInfoController {
    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("getAllMenuInfo")
    public Object getAllMenuInfo(@RequestParam int roleId) {
        return menuInfoService.getAllMenuInfo(roleId);
    }

    @RequestMapping("listMenuInfoByUserId")
    public Object listMenuInfoByUserId(HttpSession httpSession){

        UserInfo userInfo = (UserInfo) httpSession.getAttribute("userInfo");
        int userId = userInfo.getUserId();
        return menuInfoService.listMenuByUserId(userId);
    }
}

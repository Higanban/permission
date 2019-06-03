package com.chen.contrller;

import com.chen.pojo.UserInfo;
import com.chen.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ThymeleafController {

    /**
     * 使用ModelMap传值
     * @param map
     * @return
     */
    @RequestMapping("testThymeleaf")
    public String testThymeleaf(ModelMap map) {
        //该语句等同于request.setAttribute("val","今天是下雨天");
        map.put("val","今天是下雨天");
        return "TestThymeleaf";
    }

    /**
     * 使用Model传值，与ModelMap没有什么区别
     * @param map
     * @return
     */
    @RequestMapping("testThymeleafTwo")
    public String testThymeleaf(Model map) {
        //该语句等同于request.setAttribute("val","今天是下雨天");
        map.addAttribute("val","今天是下雨天");
        return "TestThymeleaf";
    }

    @RequestMapping("testThymeleafThree")
    public ModelAndView testThymeleafThree(ModelAndView modelAndView) {
        //1.ModelAndView必须设置viewName（跳转的页面）
        modelAndView.setViewName("TestThymeleaf");
        //设置值
        modelAndView.getModelMap().put("val","今天是下雨天");
        //如果使用ModelAndView则必须返回其对象
        return modelAndView;
    }
    @Autowired
    UserInfoService userInfoService;
    @RequestMapping("TestThymeleafFor")
    public ModelAndView testThymeleafFor(ModelAndView modelAndView) {
        modelAndView.setViewName("TestThymeleaf");
        List<UserInfo> allUserInfo = userInfoService.findAllUserInfo();
        modelAndView.addObject("allUserInfo",allUserInfo);
        return modelAndView;
    }
}

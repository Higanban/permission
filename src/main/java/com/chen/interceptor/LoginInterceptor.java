package com.chen.interceptor;

import com.chen.pojo.UserInfo;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        //获取请求的uri
        String uri = httpServletRequest.getRequestURI();
        //对要访问的页面进行判断
        if(uri.equals("/login.html") || uri.equals("/reg.html")) {
            return true;
        }
        //判断其是否登录
        UserInfo userInfo = (UserInfo) httpServletRequest.getSession().getAttribute("userInfo");
        System.out.println(userInfo);
        if(userInfo!=null) {
            return true;
        }
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}

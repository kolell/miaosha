package com.kole.controller;

import com.kole.dao.User;
import com.kole.result.CodeMsg;
import com.kole.result.Result;
import com.kole.service.UserService;
import com.kole.until.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value= "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public Result<Map<Object, String>> login(HttpSession session,String username, String password) {
        Map<Object,String> data = new HashMap<>();
        User user = userService.login(username, password);
        if(user == null){
            data.put("info","用户名或密码错误！");
            return Result.Respose(CodeMsg.ERROR, data);
        }
        session.setAttribute("user",user);
        data.put("info", JsonUtil.obj2StringPretty(user));
        return Result.Respose(CodeMsg.SUCCESS, data);
    }

    @RequestMapping(value= "/register.do", method = RequestMethod.POST)
    @ResponseBody
    public Result<Map<Object, String>> register(User user) {
        Map<Object,String> data = new HashMap<>();
        if (user!=null){
            userService.register(user);
            log.info("用户注册成功！");
        }else{
            data.put("info","用户名或密码错误！");
            return Result.Respose(CodeMsg.ERROR, data);
        }
        return Result.Respose(CodeMsg.SUCCESS, data);
    }
}

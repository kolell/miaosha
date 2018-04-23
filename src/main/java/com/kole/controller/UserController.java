package com.kole.controller;

import com.kole.dao.User;
import com.kole.result.CodeMsg;
import com.kole.result.Result;
import com.kole.service.UserService;
import com.kole.until.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value= "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public Result<Map<Object, String>> login(String username, String password) {
        Map<Object,String> data = new HashMap<>();
        List<User> user = userService.login(username, password);
        if(user.size()==0){
            data.put("info","用户名或密码错误！");
            return Result.Respose(CodeMsg.ERROR, data);
        }
        data.put("info", JsonUtil.obj2StringPretty(user));
        return Result.Respose(CodeMsg.SUCCESS, data);
    }

}

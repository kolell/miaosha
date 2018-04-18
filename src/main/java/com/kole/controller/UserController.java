package com.kole.controller;

import com.kole.result.CodeMsg;
import com.kole.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/user.login.do")
    @ResponseBody
    Result<Map<String, String>> login(String username, String password) {
        Map<String,String> data = new HashMap<>();

        data.put("name","konglei");
        data.put("age","24");
        return Result.Respose(CodeMsg.SUCCESS, data);
    }

}

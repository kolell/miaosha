package com.kole.controller;

import com.kole.result.CodeMsg;
import com.kole.result.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @RequestMapping("/html")
    public String html(){
        return"hello";
    }

    @RequestMapping("/success")
    @ResponseBody
    public Result<Map<String, String>> success() {
        Map<String,String> data = new HashMap<>();
        data.put("name","konglei");
        data.put("age","24");
        return Result.Respose(CodeMsg.SUCCESS, data);
    }

    @RequestMapping("/error")
    @ResponseBody
    public Result<String> error() {
        String data = "验证码错误！";
        return Result.Respose(CodeMsg.SER_ERROR, data);
    }

}

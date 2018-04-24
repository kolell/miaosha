package com.kole.controller;

import com.kole.dao.User;
import com.kole.result.CodeMsg;
import com.kole.result.Result;
import com.kole.service.UserService;
import com.kole.until.JsonUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@TestPropertySource(locations = {"classpath:application.yml"})
@SpringBootTest
public class UserControllerTest {
    @Autowired
    private UserService userService;

    @Test
    public void login() {
        Map<Object,String> data = new HashMap<>();
        User user = userService.login("kole", "test");
        if(user == null){
            Assert.assertEquals("登录失败", 6, Result.Respose(CodeMsg.ERROR, data));
            System.out.println(Result.Respose(CodeMsg.ERROR, data));
        }
        data.put("info", String.valueOf(user));
        String result = JsonUtil.obj2StringPretty(Result.Respose(CodeMsg.SUCCESS, data));
        System.out.println(result);
    }
}
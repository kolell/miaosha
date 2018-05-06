package com.kole.controller;

import com.kole.dao.MiaoshaGoods;
import com.kole.dao.User;
import com.kole.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value="/to_list", produces="text/html")
    public String list(HttpServletRequest request, HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        model.addAttribute("user", user);
        List<MiaoshaGoods> goodsList = goodsService.listGoods();
        model.addAttribute("goodsList", goodsList);
        return "goods_list";
    }

}

package com.kole.service.impl;

import com.kole.JpaRepository.GoodsRepository;
import com.kole.dao.MiaoshaGoods;
import com.kole.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public List<MiaoshaGoods> listGoods(){
        return goodsRepository.findAll();
    }
}

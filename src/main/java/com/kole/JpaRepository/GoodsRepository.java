package com.kole.JpaRepository;

import com.kole.dao.MiaoshaGoods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<MiaoshaGoods, Integer> {

    List<MiaoshaGoods> findAll();

}

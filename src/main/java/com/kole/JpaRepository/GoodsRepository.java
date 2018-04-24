package com.kole.JpaRepository;

import com.kole.dao.Goods;
import com.kole.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsRepository extends JpaRepository<Goods, Integer> {

    List<Goods> findAll();

}

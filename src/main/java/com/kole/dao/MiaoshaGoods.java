package com.kole.dao;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "miaosha_goods", catalog = "la_demo")
public class MiaoshaGoods {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private Long goodsId;
    private Integer stockCount;
    private Date startDate;
    private Date endDate;
}

package com.kole.dao;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "goods", catalog = "la_demo")
public class Goods {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private Double miaoshaPrice;
    private Integer stockCount;
    private Timestamp startDate;
    private Timestamp endDate;
}

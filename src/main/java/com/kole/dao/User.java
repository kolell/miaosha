package com.kole.dao;

import lombok.Data;

import javax.persistence.*;

import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "user", catalog = "la_demo")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String mobile;
    private Timestamp createTime;
    private Timestamp updateTime;

}

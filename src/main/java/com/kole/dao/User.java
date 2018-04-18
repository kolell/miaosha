package com.kole.dao;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "user", catalog = "springboot")
public class User {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "username", length = 16)
    private String username;

    @Column(name = "password", length = 24)
    private String password;

    @Column(name = "mobile", length = 16)
    private String mobile;

}

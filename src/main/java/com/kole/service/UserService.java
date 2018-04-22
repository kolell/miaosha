package com.kole.service;

import com.kole.dao.User;

import java.util.List;

public interface UserService {

    List<User> login(String name, String pwd);
}

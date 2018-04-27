package com.kole.service;

import com.kole.dao.User;

public interface UserService {

    User login(String name, String pwd);

    User register(User user);
}

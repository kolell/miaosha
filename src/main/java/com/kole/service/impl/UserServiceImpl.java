package com.kole.service.impl;

import com.kole.JpaRepository.UserRepository;
import com.kole.dao.User;
import com.kole.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> login(String name, String pwd){
        return (List<User>) userRepository.findByUsernameAndAndPassword(name, pwd);
    }
}

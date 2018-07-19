package com.adminin.v.service.impl;

import com.adminin.v.bean.User;
import com.adminin.v.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adminin.v.mapper.UserMapper;
import java.util.List;

@Service(value = "UserService")
public class UserSerivceImpl implements UserService{

    @Autowired
    public UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        List<User> users=userMapper.getAll();
        return users;
    }
}

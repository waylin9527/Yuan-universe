package com.example.dockerdemo.service;

import com.example.dockerdemo.bean.UserBean;

public interface UserService {

    UserBean loginIn(String name, String password);

}

package com.qcj.service;

import org.springframework.stereotype.Service;

@Service(value = "userService")
public class UserService {

    public void deleteUser(int id){
        System.out.println("删除" + id);
    }
}

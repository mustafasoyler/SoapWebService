package com.mustafasoyler.springbootsoapexample.service;

import com.mustafasoyler.spring_boot_soap_example.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
    private static  final Map<String, User> users=new HashMap<>();

    @PostConstruct
    public void init(){
        User mustafa =new User();
        mustafa.setName("Mustafa");
        mustafa.setEmpId(1);
        mustafa.setSalary(1200);

        User ozgur =new User();
        ozgur.setName("Özgür");
        ozgur.setEmpId(2);
        ozgur.setSalary(1300);

        users.put(mustafa.getName(), mustafa);
        users.put(ozgur.getName(), ozgur);

    }
    public User getUsers(String name){
        return users.get(name);
    }
}

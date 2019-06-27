package com.api.TestUser.controller;

import com.api.TestUser.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping({"/api"})
public class CrudController {

    List<User> usersList = creteUserList();

    @GetMapping /*(produces = "/application/json")*/
    public List <User> getUsersList(){
        return usersList;
    }

    private List<User> creteUserList() {
        List<User> usersList = new ArrayList<>();
        User alex = new User("Alex", "Ivanov");
        User igor = new User ("Igor", "Petrovich");
        usersList.add(alex);
        usersList.add(igor);
        return usersList;
    }
}

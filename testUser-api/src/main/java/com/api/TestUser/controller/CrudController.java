package com.api.TestUser.controller;

import com.api.TestUser.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/api"})
public class CrudController {

    private List<User> usersList = creteUserList();

    @GetMapping(produces = "application/json")
    public List<User> getUsersList() {
        return usersList;
    }

    @DeleteMapping(path = {"/{id}"})
    public User deleteUser(@PathVariable("id") Long id) {
        User delUser = usersList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst().orElse(null);
        usersList.remove(delUser);
        return delUser;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        usersList.add(user);
        System.out.println(user);
        return user;
    }

    private List<User> creteUserList() {
        List<User> usersList = new ArrayList<>();
        User alex = new User(1L, "Alex", "Ivanov");
        User igor = new User(2L, "Igor", "Petrovich");
        usersList.add(alex);
        usersList.add(igor);
        return usersList;
    }
}

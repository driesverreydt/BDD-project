package com.switchfully.bddproject;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users;

    public UserRepository() {
        users = new ArrayList<>();
    }

    public User addUser(User user) {
       users.add(user);
       if(users.contains(user)){
           return user;
       } else {
           return null;
       }
    }

    public List<User> getUsers(){
        return users;
    }
}

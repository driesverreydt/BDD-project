package com.switchfully.bddproject;

import com.switchfully.bddproject.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserList {

    private List<User> userList;

    public UserList() {
        userList = new ArrayList<>();
    }

    public List<User> getUserList() {
        return userList;
    }
}

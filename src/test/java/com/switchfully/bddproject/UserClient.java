package com.switchfully.bddproject;

import com.switchfully.bddproject.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class UserClient {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String URL = "http://localhost:9002/users";

    public User addUser(User user) {
        return restTemplate.postForObject(URL, user, User.class);
    }

    public List<User> getUsers() {
        ResponseEntity<User[]> response = restTemplate.getForEntity(URL,User[].class);
        List<User> userList = Arrays.asList(response.getBody());
        return userList;
    }
}

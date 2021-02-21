package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepoistoryImpl;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User saveUser(User user){


        return userRepository.saveUser(user);
    }

    public List<User> getAllUser() {
        return userRepository.getUsers();
    }
}

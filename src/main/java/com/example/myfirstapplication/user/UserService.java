package com.example.myfirstapplication.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired private UserRepository repo;

    public void saveUser(User user) {

        repo.save(user);
    }


    //use iterable object, so it needs to cast for a list
    public List<User> listAll(){
        return (List<User>) repo.findAll();

    }

    public User getUserByUsername(String username){
        return repo.findUsersByUsername(username);
    }


}


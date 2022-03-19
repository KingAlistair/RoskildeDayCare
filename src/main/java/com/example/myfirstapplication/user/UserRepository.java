package com.example.myfirstapplication.user;

import org.springframework.data.repository.CrudRepository;

//
public interface UserRepository extends CrudRepository<User, Integer> {

 public User findUsersByUsername(String username);


}

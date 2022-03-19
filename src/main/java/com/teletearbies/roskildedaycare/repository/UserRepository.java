package com.teletearbies.roskildedaycare.repository;

import com.teletearbies.roskildedaycare.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository // repository is a place where all your DB functions are
public interface UserRepository extends CrudRepository<User, Integer> {

    public User findUserByUsername(String username);

}

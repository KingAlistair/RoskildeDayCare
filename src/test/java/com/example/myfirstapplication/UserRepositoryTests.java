package com.example.myfirstapplication;

import com.example.myfirstapplication.user.User;
import com.example.myfirstapplication.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Iterator;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)

public class UserRepositoryTests {
@Autowired private UserRepository  repo;

@Test
    public void testAddNewUser(){
    User user = new User();
    user.setUsername("mubbi");
    user.setPassword("1234");
    user.setFirstName("mubbi");
    user.setLastName("dombovari");

    User savedUser = repo.save(user);

    Assertions.assertThat(savedUser).isNotNull();
    Assertions.assertThat(savedUser.getId()).isGreaterThan(0);

    }

    @Test
    public void listAll(){
        Iterable<User> users = repo.findAll();
        Assertions.assertThat(users).hasSizeGreaterThan(0);

        for(User user : users) {
            System.out.println(user);
            
        }

    }

    @Test
    public void testUpdateUserPassword(){
         Integer userId = 2;
         Optional<User> optionalUser = repo.findById(userId);
         User user = optionalUser.get();
         user.setPassword("hello123");
         repo.save(user);


   User updatedUser = repo.findById(userId).get();
   Assertions.assertThat(updatedUser.getPassword()).isEqualTo("hello123");
    }

    @Test
    public void testGetById() {
        Integer userId = 1;

        Optional<User> optionalUser = repo.findById(userId);
         Assertions.assertThat(optionalUser).isPresent();
        System.out.println(optionalUser.get());
    }

    @Test
    public void testDelete(){
    Integer userId = 5;
     repo.deleteById(userId);

     Optional<User> optionalUser = repo.findById(userId);
     Assertions.assertThat(optionalUser).isNotPresent();

    }
}





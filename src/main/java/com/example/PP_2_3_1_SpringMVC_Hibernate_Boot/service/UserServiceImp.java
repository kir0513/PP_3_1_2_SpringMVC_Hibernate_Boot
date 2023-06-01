package com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.service;

import com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.example.PP_2_3_1_SpringMVC_Hibernate_Boot.repository.UserRepository;

import java.util.List;

@Repository
@Transactional
public class UserServiceImp implements UserService {
   // private final UserDao userDao;
   private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public User getSingleUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Пользователя с таким ID не существует!!!")
        );
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Integer id) {
        userRepository.deleteById(id);
    }



}

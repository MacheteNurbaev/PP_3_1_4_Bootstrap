package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao {


    List<User> getAllUsers();

    void deleteUser(Long id);

    void addUser(User user);

    void changeUser(User user);

    User getUser(Long id);

    User findUserByName(String username);


}

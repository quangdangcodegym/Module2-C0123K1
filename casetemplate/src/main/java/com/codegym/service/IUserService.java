package com.codegym.service;


import com.codegym.model.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();

    User findUserById(long id);
    void updateUserById(long id, User user);
    void deleteUserBookById(long id);

    User checkUsernamePassword(String ussername, String password);
}

package com.codegym.service.file;

import com.codegym.model.User;
import com.codegym.service.IUserService;
import com.codegym.utils.FileUtils;

import java.util.List;

public class UserService implements IUserService {
    private final String pathUser = "./data/user.scv";
    @Override
    public List<User> getAll() {
        return FileUtils.readDataFromFile(pathUser, FileUtils.CLASS_USER);
    }

    @Override
    public User findUserById(long id) {
        List<User> users = getAll();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == id) {
                return users.get(i);
            }
        }
        return null;
    }

    @Override
    public void updateUserById(long id, User user) {

    }

    @Override
    public void deleteUserBookById(long id) {

    }

    @Override
    public User checkUsernamePassword(String ussername, String password) {
        List<User> users = getAll();
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsername().equals(ussername) && users.get(i).getPassword().equals(password)) {
                return users.get(i);
            }
        }
        return null;
    }
}

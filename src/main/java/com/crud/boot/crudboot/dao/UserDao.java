package com.crud.boot.crudboot.dao;

import com.crud.boot.crudboot.model.User;
import java.util.List;

public interface UserDao {
    public User getUser(int id);
    public List<User> getAllUsers();
    public void saveUser(User user);
    public void deleteUser(int id);
    public void updateUser(User user);
}

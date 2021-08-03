package com.qoobico.remindme.server.Service;

import com.qoobico.remindme.server.entity.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void save(User user);
    void delete(int id);
    User getUserById(int id);
}
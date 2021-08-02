package com.qoobico.remindme.server.dao;

import com.qoobico.remindme.server.entity.User;

import java.util.List;

public interface UserDaoInterface {
    public List<User> getUserList();
    public User getUserById(int id);
    public void save(User user);
    public void update(int id, User user);
    public void delete(int id);
}

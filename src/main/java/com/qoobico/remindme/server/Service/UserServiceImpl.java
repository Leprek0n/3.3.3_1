package com.qoobico.remindme.server.Service;

import com.qoobico.remindme.server.dao.UserDaoImpl;
import com.qoobico.remindme.server.dao.UserDaoInterface;
import com.qoobico.remindme.server.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    UserServiceImpl() {}
    private UserDaoInterface userDaoInterface;
    @Autowired
    public UserServiceImpl(UserDaoInterface userDaoInterface) {
        this.userDaoInterface = userDaoInterface;
    }

    @Override
    public List<User> allUsers() {
        return userDaoInterface.getUserList();
    }

    @Override
    public void save(User user) {
    userDaoInterface.save(user);
    }

    @Override
    public void delete(int id) {
    userDaoInterface.delete(id);
    }

    @Override
    public User getUserById(int id) {
        return userDaoInterface.getUserById(id);
    }
}

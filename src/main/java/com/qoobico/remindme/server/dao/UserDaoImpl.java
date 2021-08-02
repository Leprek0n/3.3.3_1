package com.qoobico.remindme.server.dao;

import com.qoobico.remindme.server.dao.UserDaoInterface;
import com.qoobico.remindme.server.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.*;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDaoInterface {

    @PersistenceContext(unitName="entityManagerBean")
    private EntityManager em;

    public List<User> getUserList() {
    if(em == null)
        System.out.println("Hello");
        return em.createQuery("from user").getResultList();
    }

    public User getUserById(int id) {
        TypedQuery<User> u = em.createQuery("select u user where u.id = :id", User.class);
        u.setParameter("id", id);
        return u.getResultList().stream().findAny().orElse(null);

    }

    @Override
    public void save(User user) {

    }




    public void update(int id, User user) {
//        session.beginTransaction();
//        User userToUpdate = session.get(User.class, id);
//        userToUpdate.setSureName(user.getSureName());
//        userToUpdate.setName(user.getName());
//        session.saveOrUpdate(userToUpdate);
//        session.getTransaction().commit();
    }

    public void delete(int id) {
        User manage = em.find(User.class, id);
        em.remove(manage);
    }
}

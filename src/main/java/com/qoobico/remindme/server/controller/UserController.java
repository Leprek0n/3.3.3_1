package com.qoobico.remindme.server.controller;

import com.qoobico.remindme.server.dao.UserDaoImpl;
import com.qoobico.remindme.server.dao.UserDaoInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    UserDaoInterface userDaoInterface = new UserDaoImpl();
    @GetMapping("/users")
    public String sayHello(Model model) {
        model.addAttribute("users", userDaoInterface.getUserList());
        return "views/user";
    }
}

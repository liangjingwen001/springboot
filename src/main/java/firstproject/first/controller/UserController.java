package firstproject.first.controller;

import firstproject.first.bean.User;
import firstproject.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("user")
    public User getById(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping("allUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("saveUser")
    public User saveUser(User user) {
        userService.saveUser(user);
        return user;
    }
}

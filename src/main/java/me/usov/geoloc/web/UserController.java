package me.usov.geoloc.web;

import me.usov.geoloc.domain.User;
import me.usov.geoloc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mikhailusov on 12/10/15.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }
}

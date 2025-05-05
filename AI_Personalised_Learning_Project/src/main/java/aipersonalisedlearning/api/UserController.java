package aipersonalisedlearning.api;

import aipersonalisedlearning.creational_patterns.abstractfactory.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import aipersonalisedlearning.services.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestParam String email, @RequestParam String password) {
        return userService.login(email, password);
    }

    @PutMapping("/profile")
    public void updateProfile(@RequestBody User updatedUser) {
        userService.updateProfile(updatedUser);
    }
}

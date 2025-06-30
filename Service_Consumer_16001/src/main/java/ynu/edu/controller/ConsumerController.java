package ynu.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import ynu.edu.entity.User;
import ynu.edu.service.UserService;

@RestController
@RefreshScope
@RequestMapping("/api/consumer")
public class ConsumerController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/update/{id}")
    public void updateUser(@PathVariable("id") String id, @RequestBody User user) {
        userService.updateUser(id, user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}

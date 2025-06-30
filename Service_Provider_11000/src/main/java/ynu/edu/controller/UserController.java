package ynu.edu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {


    @PostMapping("/post")
    public String createUser() {
        return "{\"message\": \"User created successfully\"}";
    }

    @PutMapping("/put/{id}")
    public String updateUser(@PathVariable("id") String id) {
        return "{\"message\": \"User with id " + id + " updated successfully\"}";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") String id) {
        return "{\"message\": \"User with id " + id + " deleted successfully\"}";
    }
}




//package ynu.edu.controller;
//
//
//import org.springframework.web.bind.annotation.*;
//import ynu.edu.entity.User;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @GetMapping("/{id}")
//    public String getUser(@PathVariable("id") String id) {
////        return new User(id, "John Doe");
//        return "1 Jhon Doe";
//    }
//
//    @PostMapping("/")
//    public User createUser(@RequestBody User user) {
////        user.setId("123");
//        return user;
//    }
//
//    @PutMapping("/{id}")
//    public User updateUser(@PathVariable("id") String id, @RequestBody User user) {
////        user.setId(id);
//        return user;
//    }
//
//    @DeleteMapping("/{id}")
//    public String deleteUser(@PathVariable("id") String id) {
//        return "User with id " + id + " deleted.";
//    }
//}


//@RestController
//@RequestMapping("/api/user")
//public class UserController {
//    @GetMapping("/getUserById/{userId}")
//    public User GetUserById(@PathVariable("userId") Integer userId){
//        User user = new User();
//        user.setUserId(userId);
//        user.setUserName("小明 from 11000");
//        user.setPassWord("123456");
//        return user;
//    }
//}

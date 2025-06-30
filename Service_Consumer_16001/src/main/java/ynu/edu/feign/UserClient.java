package ynu.edu.feign;

import org.springframework.web.bind.annotation.*;
import ynu.edu.entity.User;

@FeignClient("provider-service2")
public interface UserClient {

    @GetMapping("/api/users/{id}")
    User getUser(@PathVariable("id") String id);

    @PostMapping("/api/users/")
    User createUser(@RequestBody User user);

    @PutMapping("/api/users/{id}")
    void updateUser(@PathVariable("id") String id, @RequestBody User user);

    @DeleteMapping("/api/users/{id}")
    void deleteUser(@PathVariable("id") String id);
}


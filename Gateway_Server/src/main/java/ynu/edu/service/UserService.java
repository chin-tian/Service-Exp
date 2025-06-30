package ynu.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ynu.edu.entity.User;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    private static final String PROVIDER_URL = "http://localhost:11000/api/users";

    public User getUser(String id) {
        return restTemplate.getForObject(PROVIDER_URL + "/" + id, User.class);
    }

    public User createUser(User user) {
        return restTemplate.postForObject(PROVIDER_URL, user, User.class);
    }

    public void updateUser(String id, User user) {
        restTemplate.put(PROVIDER_URL + "/" + id, user);
    }

    public void deleteUser(String id) {
        restTemplate.delete(PROVIDER_URL + "/" + id);
    }
}

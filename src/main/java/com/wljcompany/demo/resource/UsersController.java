package com.wljcompany.demo.resource;

import com.wljcompany.demo.mapper.UserMapper;
import com.wljcompany.demo.model.User;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private UserMapper userMapper;

    public UsersController(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @GetMapping
    List<User> getAllUsers() {
        return userMapper.findAll();
    }

    @PostMapping
    List<User> createUser(@RequestBody User user) {
        userMapper.create(user);
        return userMapper.findAll();
    }

    @GetMapping("/{id}")
    User getUser(@PathVariable Long id) {
        return userMapper.findById(id);
    }

    @PutMapping("/{id}")
    User updateUser(@PathVariable Long id, @RequestBody User user) {
        userMapper.updateUser(id, user);
        return userMapper.findById(id);
    }

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable Long id) {
        userMapper.deleteUser(id);
    }
}

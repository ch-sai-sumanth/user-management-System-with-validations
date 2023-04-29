package com.example.UserManagementSystem.controllers;

import com.example.UserManagementSystem.models.User;
import com.example.UserManagementSystem.services.UserService;
import jakarta.validation.Valid;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class UserController {

    @Autowired
    UserService us;

    @PostMapping(value="addUser")
    public String addUserToService(@Valid @RequestBody User userData)
    {
        return us.addUserToDao(userData);
    }



    @GetMapping(value="getAllUsers")
    public List<User> getAllUsers()
    {
        return us.getAllUsers();
    }

    @GetMapping(value="getUser/{userId}")
    public User getUserById(@PathVariable String userId)
    {
        return us.getUserById(userId);
    }

    @PutMapping(value="updateUserInfo/{userId}")
    public String updateUser(@PathVariable String userId,@RequestBody User updatedUserData)
    {
        return us.updateUser(userId,updatedUserData);
    }
    @DeleteMapping(value="deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId)
    {
        return us.deleteUser(userId);
    }
}

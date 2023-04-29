package com.example.UserManagementSystem.services;

import com.example.UserManagementSystem.models.User;
import com.example.UserManagementSystem.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public String addUserToDao(User userData)
    {
        boolean status=userDao.save(userData);

        if(status)
            return "user added succesfully";

        return "user not added";
    }

    public List<User> getAllUsers()
    {
        return userDao.getUsers();
    }

    public User getUserById(String userId)
    {

        for(User user: userDao.getUsers())
        {
            String id= String.valueOf(user.getUserId());
            if(id.equals(userId))
            {
                return user;
            }
        }
       return null;
    }

    public String updateUser(String userId,User userData)
    {
        boolean status=userDao.updateUser(userId,userData);
        if(status)
            return "User details updated succesfully";

        return "not updated, please try again";
    }

    public String deleteUser(String userId)
    {
        boolean status=userDao.deleteUser(userId);
        if(status)
            return "User deleted succesfully";
        return "not deleted";

    }
}

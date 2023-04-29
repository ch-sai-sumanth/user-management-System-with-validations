package com.example.UserManagementSystem.repository;

import com.example.UserManagementSystem.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {

    List<User> userList=new ArrayList<>();

    public boolean save(User userData)
    {
        userList.add(userData);

        return true;
    }

    public List<User> getUsers()
    {
        return userList;
    }

    public boolean updateUser(String userId,User userData)
    {
        for(User user: userList)
        {
            String id= String.valueOf(user.getUserId());
            if(id.equals(userId))
            {
               userList.remove(user);
               userList.add(userData);
               return true;
            }
        }
        return false;
    }

    public boolean deleteUser(String userId)
    {
        for(User user: userList)
        {
            String id= String.valueOf(user.getUserId());
            if(id.equals(userId))
            {
                userList.remove(user);
                return true;
            }
        }
        return false;
    }

}

package com.example.URL_Hit_Counter.service;

import com.example.URL_Hit_Counter.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlHitService {


    @Autowired
    User user;

    public User getHitCount(String userName)
    {
        User.visitors+=1;

        user.setUsername(userName);
        int hitCount=user.getHitCount();
        user.setHitCount(hitCount+1);

        return user;
    }

}

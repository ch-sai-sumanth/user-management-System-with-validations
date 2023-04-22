package com.example.URL_Hit_Counter.controller;

import com.example.URL_Hit_Counter.model.User;
import com.example.URL_Hit_Counter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlHitController {

    @Autowired
    UrlHitService uhs;


    @GetMapping(value="/username/{yourUserName}/count")
    public User getHitCount(@PathVariable String yourUserName)
    {

        return uhs.getHitCount(yourUserName);
    }

    @GetMapping(value="/count")
    public String getVisitorCount()
    {
        User.visitors+=1;
        return "Visitors: "+User.visitors;
    }
}

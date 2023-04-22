package com.example.URL_Hit_Counter.model;


import org.springframework.stereotype.Component;

@Component
public class User {

    public static int visitors=0;
    String Username;
    int hitCount;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }
}

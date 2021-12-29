package com.kodilla.stream.immutable;



//zadanie 7.2
public class ForumUser {

    private final String username;
    private final String realName;


    public ForumUser (final String username, final String realName){
        this.realName = realName;
        this.username = username;
    }

    public String getRealName() {
        return realName;
    }

    public String getUsername() {
        return username;
    }
}




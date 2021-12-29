

package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(1234, "Name1", 'm', 2000,7, 1, 7));
        usersList.add(new ForumUser(5678, "Name2", 'w', 1980, 5, 12, 2));
        usersList.add(new ForumUser(5678, "Name2", 'm', 2005, 3, 10,0));
    }

    public List<ForumUser> getUsersList(){
        return new ArrayList<>(usersList);
    }
}



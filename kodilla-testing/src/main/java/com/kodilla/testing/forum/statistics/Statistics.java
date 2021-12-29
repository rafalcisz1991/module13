package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    //List of Users
    List<String> usersNames();

    // number of posts
    int postsCount();

    //number of comments
    int commentsCount();
}

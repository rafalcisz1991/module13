package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    int postsCount;
    int commentsCount;
    int usersCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public int getUsersCount() {
        return usersCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics myStatistics){

        postsCount = myStatistics.postsCount();
        commentsCount = myStatistics.commentsCount();
        usersCount = myStatistics.usersNames().size();












    }

}

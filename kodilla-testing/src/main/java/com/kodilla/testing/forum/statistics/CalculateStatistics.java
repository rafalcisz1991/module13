package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    double postsCount;
    double commentsCount;
    double usersCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public double getPostsCount() {
        return postsCount;
    }

    public double getCommentsCount() {
        return commentsCount;
    }

    public double getUsersCount() {
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

    public void calculateAdvStatistics(Statistics myStatistics) {

        postsCount = myStatistics.postsCount();
        commentsCount = myStatistics.commentsCount();
        usersCount = myStatistics.usersNames().size();

        if(usersCount != 0) {
            averageCommentsPerUser = commentsCount / usersCount;
        } else {
            averageCommentsPerUser = 0;
        }
        if(postsCount != 0){
            averageCommentsPerPost = commentsCount/postsCount;
        } else {
            averageCommentsPerPost = 0;
        }
        if(commentsCount != 0) {
            averagePostsPerUser = postsCount/usersCount;
        } else {
            averagePostsPerUser = 0;
        }
    }
}





package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    double postsCount;
    double commentsCount;
    double usersCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;
    boolean division0Condition;

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

    public boolean isDivision0Condition() {
        return division0Condition;
    }

    public void calculateAdvStatistics(Statistics myStatistics) {
        division0Condition = true;

        postsCount = myStatistics.postsCount();
        commentsCount = myStatistics.commentsCount();
        usersCount = myStatistics.usersNames().size();

        if(usersCount == 0) {
            isDivision0Condition();
        } else {
            averageCommentsPerUser = commentsCount / usersCount;
        }
        if(postsCount == 0){
            isDivision0Condition();
        } else {
            averageCommentsPerPost = commentsCount/postsCount;
        }
        if(usersCount == 0) {
            isDivision0Condition();
        } else {
            averagePostsPerUser = postsCount/usersCount;
        }
    }
}





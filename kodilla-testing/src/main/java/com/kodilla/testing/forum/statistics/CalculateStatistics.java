package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {
    double postsCount;
    double commentsCount;
    double usersCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;
    boolean division0PostsCondition;
    boolean division0CommentsCondition;
    boolean division0UsersCondition;

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

    public boolean isDivision0PostsCondition() {
        return division0PostsCondition;
    }

    public boolean isDivision0UsersCondition() {
        return division0UsersCondition;
    }
    public boolean isDivision0CommentsCondition() {
        return division0CommentsCondition;
    }

    public void calculateAdvStatistics(Statistics myStatistics) {
        division0PostsCondition = true;
        division0CommentsCondition = true;
        division0UsersCondition = true;

        postsCount = myStatistics.postsCount();
        commentsCount = myStatistics.commentsCount();
        usersCount = myStatistics.usersNames().size();

        if(usersCount == 0) {
            isDivision0UsersCondition();
        } else {
            averageCommentsPerUser = commentsCount / usersCount;
        }
        if(postsCount == 0){
            isDivision0PostsCondition();
        } else {
            averageCommentsPerPost = commentsCount/postsCount;
        }
        if(commentsCount == 0) {
            isDivision0CommentsCondition();
        } else {
            averagePostsPerUser = postsCount/usersCount;
        }
    }
}





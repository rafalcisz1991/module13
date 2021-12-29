package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics {

    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    private Statistics myStatistics;

    public CalculateStatistics(Statistics myStatistics) {

        this.myStatistics = myStatistics;
    }

    public int calculateAdvStatistics(Statistics myStatistics){

        int calculatePostsCount = myStatistics.postsCount();
        int calculateCommentsCount = myStatistics.commentsCount();
        return calculatePostsCount;
        return calculateCommentsCount;








    }

}

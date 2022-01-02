package com.kodilla.testing.forum.statistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {

    @Test
    void testAdvStatisticsWith0Posts() {
        //Given
        List<String> usersList = generateListOfUsers(4);
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Mock input of suggested data: number of posts = 0
        when(statisticsMock.postsCount()).thenReturn(0);
        //random input of rest of the data: number of comments = 10
        when(statisticsMock.commentsCount()).thenReturn(10);
        //random input of rest  of the data: number of users = 4
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.getPostsCount());
        assertEquals(4, calculateStatistics.getUsersCount());
        assertEquals(10, calculateStatistics.getCommentsCount());
        assertEquals(0, calculateStatistics.getAveragePostsPerUser());
        assertEquals(2.5, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0, calculateStatistics.getAverageCommentsPerPost());

    }

    @Test
    void testAdvStatisticsWith1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Mock input of suggested data: number of posts = 1000
        when(statisticsMock.postsCount()).thenReturn(1000);
        //random input of rest of the data: number of comments = 10
        when(statisticsMock.commentsCount()).thenReturn(10);
        //random input of rest  of the data: number of users = 4
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(4));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculateStatistics.getPostsCount());
        assertEquals(4, calculateStatistics.getUsersCount());
        assertEquals(10, calculateStatistics.getCommentsCount());
        assertEquals(250, calculateStatistics.getAveragePostsPerUser());
        assertEquals(2.5, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.01, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testAdvStatisticsWith0Comments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Random Mock input of rest of the data: number of posts = 1000
        when(statisticsMock.postsCount()).thenReturn(1000);
        //Suggested Mock input of the data: number of comments = 0
        when(statisticsMock.commentsCount()).thenReturn(0);
        //Random input of rest of the data: number of users = 4
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(4));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculateStatistics.getPostsCount());
        assertEquals(4, calculateStatistics.getUsersCount());
        assertEquals(0, calculateStatistics.getCommentsCount());
        assertEquals(250, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testAdvStatisticsCommentsLessThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Random Mock input of rest of the data: number of posts = 30
        when(statisticsMock.postsCount()).thenReturn(30);
        //Suggested Mock input of the data: number of comments = 20
        when(statisticsMock.commentsCount()).thenReturn(20);
        //Random input of rest of the data: number of users = 4
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(4));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(30, calculateStatistics.getPostsCount());
        assertEquals(4, calculateStatistics.getUsersCount());
        assertEquals(20, calculateStatistics.getCommentsCount());
        assertEquals(7.5, calculateStatistics.getAveragePostsPerUser());
        assertEquals(5, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.6666666666666666, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testAdvStatisticsCommentsMoreThenPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Random Mock input of rest of the data: number of posts = 45
        when(statisticsMock.postsCount()).thenReturn(45);
        //Suggested Mock input of the data: number of comments = 120
        when(statisticsMock.commentsCount()).thenReturn(120);
        //Random input of rest of the data: number of users = 4
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(4));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(45, calculateStatistics.getPostsCount());
        assertEquals(4, calculateStatistics.getUsersCount());
        assertEquals(120, calculateStatistics.getCommentsCount());
        assertEquals(11.25, calculateStatistics.getAveragePostsPerUser());
        assertEquals(30, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(2.6666666666666666, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testAdvStatisticsWith0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Mock input of suggested data: number of posts = 1000
        when(statisticsMock.postsCount()).thenReturn(1000);
        //random input of rest of the data: number of comments = 10
        when(statisticsMock.commentsCount()).thenReturn(10);
        //random input of rest  of the data: number of users = 0
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(0));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculateStatistics.getPostsCount());
        assertEquals(0, calculateStatistics.getUsersCount());
        assertEquals(10, calculateStatistics.getCommentsCount());
        assertEquals(0, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.01, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testAdvStatisticsWith1000Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Mock input of suggested data: number of posts = 1000
        when(statisticsMock.postsCount()).thenReturn(1000);
        //random input of rest of the data: number of comments = 50
        when(statisticsMock.commentsCount()).thenReturn(50);
        //random input of rest  of the data: number of users = 0
        when(statisticsMock.usersNames()).thenReturn(generateListOfUsers(1000));

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculateStatistics.getPostsCount());
        assertEquals(1000, calculateStatistics.getUsersCount());
        assertEquals(50, calculateStatistics.getCommentsCount());
        assertEquals(1, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0.05, calculateStatistics.getAverageCommentsPerUser());
        assertEquals(0.05, calculateStatistics.getAverageCommentsPerPost());;
    }

    private List<String> generateListOfUsers(int usersCount) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < usersCount; i++) {
            resultList.add("User" + i);
        }
        return resultList;
    }
}




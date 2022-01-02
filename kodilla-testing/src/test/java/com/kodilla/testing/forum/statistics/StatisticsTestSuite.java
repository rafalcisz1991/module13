package com.kodilla.testing.forum.statistics;


import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
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
        assertTrue(calculateStatistics.isDivision0PostsCondition());
    }

    @Test
    void testAdvStatisticsWith1000Posts() {
        //Given
        List<String> usersList = generateListOfUsers(4);
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Mock input of suggested data: number of posts = 1000
        when(statisticsMock.postsCount()).thenReturn(1000);
        //random input of rest of the data: number of comments = 10
        when(statisticsMock.commentsCount()).thenReturn(10);
        //random input of rest  of the data: number of users = 4
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, calculateStatistics.getPostsCount());
        assertFalse(calculateStatistics.isDivision0PostsCondition());
        assertEquals(250, calculateStatistics.getAveragePostsPerUser());
        assertEquals(0.01, calculateStatistics.getAverageCommentsPerPost());
    }

    @Test
    void testAdvStatisticsWith0Comments() {
        //Given
        List<String> usersList = generateListOfUsers(4);
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Mock input of suggested data: number of posts = 1000
        when(statisticsMock.postsCount()).thenReturn(1000);
        //random input of rest of the data: number of comments = 10
        when(statisticsMock.commentsCount()).thenReturn(0);
        //random input of rest  of the data: number of users = 4
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertTrue(calculateStatistics.isDivision0CommentsCondition());
        assertEquals(0, calculateStatistics.getCommentsCount());
    }

    @Test
    void testAdvStatisticsCommentsLessThenPosts() {
        //Given
        List<String> usersList = generateListOfUsers(4);
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        //Mock input of suggested data: number of posts = 0
        when(statisticsMock.postsCount()).thenReturn(10);
        //random input of rest of the data: number of comments = 10
        when(statisticsMock.commentsCount()).thenReturn(5);
        //random input of rest  of the data: number of users = 5
        when(statisticsMock.usersNames()).thenReturn(usersList);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
    }

    @Test
    void testAdvStatisticsCommentsMoreThenPosts() {
        //Given

        //When

        //Then
    }

    @Test
    void testAdvStatisticsWith0Users() {
        //Given

        //When

        //Then
    }

    @Test
    void testAdvStatisticsWith1000Users() {
        //Given

        //When

        //Then
    }

    private List<String> generateListOfUsers(int usersCount) {
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < usersCount; i++) {
            resultList.add("User" + i);

        }
        return resultList;
    }
}




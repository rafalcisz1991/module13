package com.kodilla.testing.forum.statistics;


import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StatisticsTestSuite {



    @Test
    void testAdvStatistics0Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, calculateStatistics.getPostsCount());
    }

    @Test
    void testAdvStatistics1000Posts(){
        //Given

        //When

        //Then
    }

    @Test
    void testAdvStatistics0Comments(){
        //Given

        //When

        //Then
    }

    @Test
    void testAdvStatisticsCommentsLessThenPosts(){
        //Given

        //When

        //Then
    }

    @Test
    void testAdvStatisticsCommentsMoreThenPosts(){
        //Given

        //When

        //Then
    }

    @Test
    void testAdvStatistics0Users(){
        //Given

        //When

        //Then
    }

    @Test
    void testAdvStatistics1000Users(){
        //Given

        //When

        //Then
    }





}

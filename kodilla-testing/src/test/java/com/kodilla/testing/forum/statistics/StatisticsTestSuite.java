package com.kodilla.testing.forum.statistics;


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

    @Mock
    private Statistics statisticsMock;

    @Test
    void testAdvStatistics0Posts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);
        Statistics statisticsMock = mock(Statistics.class);

        //When
        int zeroPosts = calculateStatistics.calculateAdvStatistics(testsStatistics1());

        //Then
        assertEquals(0, zeroPosts);
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

    private Statistics testsStatistics1(){
        Statistics statistics = new Statistics() {

            @Override
            public List<String> usersNames() {
                return usersNames();
            }

            @Override
            public int postsCount() {
                return 0;
            }

            @Override
            public int commentsCount() {
                return 0;
            }
        };
        return statistics;
    }

    private Statistics testStatistics2(){
        Statistics statistics = new Statistics() {
            @Override
            public List<String> usersNames() {
                return null;
            }

            @Override
            public int postsCount() {
                return 1000;
            }

            @Override
            public int commentsCount() {
                return 0;
            }
        };
        return statistics;
    }

    private Statistics testStatistics3(){
        Statistics statistics = new Statistics() {
            @Override
            public List<String> usersNames() {
                return null;
            }

            @Override
            public int postsCount() {
                return 5;
            }

            @Override
            public int commentsCount() {
                return 3;
            }
        };
        return statistics;
    }

    private  Statistics testStatistics4(){
        Statistics statistics = new Statistics() {
            @Override
            public List<String> usersNames() {
                return null;
            }

            @Override
            public int postsCount() {
                return 3;
            }

            @Override
            public int commentsCount() {
                return 5;
            }
        };
        return statistics;
    }

    private Statistics testStatistics5(){
        Statistics statistics = new Statistics() {
            @Override
            public List<String> usersNames() {
                for (int i = 0; i < 100; i++){
                    usersNames().add("Username " + i);
                }
                return usersNames();
            }

            @Override
            public int postsCount() {
                return 0;
            }

            @Override
            public int commentsCount() {
                return 0;
            }
        };
        return statistics;
    }

}

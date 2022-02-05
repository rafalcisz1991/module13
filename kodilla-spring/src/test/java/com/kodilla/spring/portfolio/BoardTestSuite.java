package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = {BoardTestSuite.class})
@ExtendWith(SpringExtension.class)
public class BoardTestSuite {

    @Test
    void testBoardTaskLists() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList();
        board.getDoneList();
        board.getInProgressList();

        //Then
        assertEquals(3, board.getAllTaskLists().size());
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("toDoTask");
        board.getDoneList().tasks.add("Done task");
        board.getInProgressList().tasks.add("In progress task");

        //Then
        assertEquals(1, board.getToDoList().tasks.size());
        assertEquals(1, board.getDoneList().tasks.size());
        assertEquals(1, board.getInProgressList().tasks.size());
        assertEquals("toDoTask", board.getToDoList().tasks.get(0));
        assertEquals("Done task", board.getDoneList().tasks.get(0));
        assertEquals("In progress task", board.getInProgressList().tasks.get(0));
    }
}

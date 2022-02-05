package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = {BoardTestSuite.class})
@ExtendWith(SpringExtension.class)
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When & Then
        board.getToDoList();
        board.getDoneList();
        board.getInProgressList();
    }

    @Test
    void testTaskListSize() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        boolean isEmptyDoneList = board.getDoneList().tasks.isEmpty();
        boolean isEmptyProgressList = board.getInProgressList().tasks.isEmpty();
        boolean isEmptyTodoList = board.getToDoList().tasks.isEmpty();

        //Then
        assertTrue(isEmptyDoneList);
        assertTrue(isEmptyProgressList);
        assertTrue(isEmptyTodoList);
    }
}

package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private static final String LISTNAME = "LIST 1";
    private static final String DESCRIPTION = "My description";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName;

        //When
        List<TaskList> readLists = taskListDao.findByListName(listName);
        String expectedName = readLists.get(0).getListName;
        String expectedDescription = readLists.get(0).getDescription;

        //Then
        assertEquals(1, readLists.size());
        assertEquals("LIST 1", expectedName);
        assertEquals("My description", expectedDescription);


        //clean-up
        /*int id = readLists.get(0).getId();
        taskListDao.deleteById(id);*/
    }
}

package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("taskList1")
    TaskList toDoList;

    @Autowired
    @Qualifier("taskList2")
    TaskList inProgressList;

    @Autowired
    @Qualifier("taskList3")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "taskList1")
    @Scope("prototype")
    public TaskList getTaskList1() {
        return new TaskList();
    }

    @Bean(name = "taskList2")
    @Scope("prototype")
    public TaskList getTaskList2() {
        return new TaskList();
    }

    @Bean(name = "taskList3")
    @Scope("prototype")
    public TaskList getTaskList3() {
        return new TaskList();
    }
}

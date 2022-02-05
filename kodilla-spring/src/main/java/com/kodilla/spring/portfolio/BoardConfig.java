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
    TaskList taskList;

    @Bean
    public Board board() {
        return new Board(taskList, taskList, taskList);
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

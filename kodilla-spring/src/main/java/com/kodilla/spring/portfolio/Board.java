package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {

    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public List<TaskList> getAllTaskLists() {
        List<TaskList> allLists = new ArrayList<>();
        allLists.add(toDoList);
        allLists.add(inProgressList);
        allLists.add(toDoList);
        return allLists;
    }
}

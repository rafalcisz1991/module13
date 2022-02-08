package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class DrivingTask implements Task{

    private final String taskName;
    private final String where;
    private final double using;
    private boolean taskExecution;

    public DrivingTask(final String taskName, final String where, final double using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (using == 20){
            taskExecution = true;
            System.out.println("Task executed!");
        }
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecution;
    }
}

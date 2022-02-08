package com.kodilla.patterns.factory.tasks;

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
        System.out.println("Task is being executed");
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

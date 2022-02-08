package com.kodilla.patterns.factory.tasks;

import java.util.Random;

public final class ShoppingTask implements Task{

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskExecution;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if(randomNumber == 0) {
            taskExecution = true;
        }
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

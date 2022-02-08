package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Driving task", "closest city", 20);
            case PAINTINGTASK:
                return new PaintingTask("Painting task", "white", "walls");
            case SHOPPINGTASK:
                return new ShoppingTask("Shopping task", "groceries", 10);
            default:
                return null;
        }
    }
}

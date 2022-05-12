package com.example.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(HomeworkTasks homeworkTasks) {
        System.out.println(name + ": You have following number of task to check: " + homeworkTasks.getTasks().size() +
                "for attendee: " + homeworkTasks.getAttendeeName());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

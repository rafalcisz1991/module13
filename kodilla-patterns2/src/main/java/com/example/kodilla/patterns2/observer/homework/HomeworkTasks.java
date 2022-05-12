package com.example.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkTasks implements Observable {
    private final List<Observer> observers;
    private final List<String> tasks;
    private final String attendeeName;

    public HomeworkTasks(String attendeeName) {
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
        this.attendeeName = attendeeName;
    }

    public void addTask(String taskName) {
        tasks.add(taskName);
        notifyObservers();
    }

    @Override
    public void registryObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getAttendeeName() {
        return attendeeName;
    }
}

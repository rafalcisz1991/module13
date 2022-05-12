package com.example.kodilla.patterns2.observer.homework;

public interface Observable {
    void registryObserver(Observer observer);
    void notifyObservers();
    void deleteObserver(Observer observer);
}

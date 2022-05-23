package com.example.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObserver(Observer observer);
    void notifyObservers();
    void deleteObserver(Observer observer);
}

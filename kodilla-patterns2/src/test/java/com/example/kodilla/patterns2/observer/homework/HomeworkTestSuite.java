package com.example.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HomeworkTestSuite {

    @Test
    public void testUpdate() {
        //Given
        HomeworkTasks attendee1List = new Attendee1List();
        HomeworkTasks attendee2List = new Attendee2List();
        HomeworkTasks attendee3List = new Attendee3List();
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");
        attendee1List.registryObserver(mentor1);
        attendee2List.registryObserver(mentor2);
        attendee3List.registryObserver(mentor2);

        //When
        attendee1List.addTask("Task1");
        attendee2List.addTask("Task1");
        attendee3List.addTask("Task1");
        attendee2List.addTask("Task2");

        //Then
        assertEquals(1, mentor1.getUpdateCount());
        assertEquals(3, mentor2.getUpdateCount());
     }
}

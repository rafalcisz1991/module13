package com.kodilla.hibernate.tasklist;


import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "TASKLIST")
public class TaskList {

    private int id;
    private String listName;
    private String description;

    public TaskList() {

    }

    public TaskList(String listName, String description) {
        this.description = description;
        this.listName = listName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    @Column(name = "LISTNAME")
    public String getListName;

    @Column(name = "DESCRIPTION")
    public String getDescription;

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void setId(int id) {
        this.id = id;
    }
}

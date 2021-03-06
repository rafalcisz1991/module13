package com.kodilla.hibernate.manytomany;

import com.sun.istack.NotNull;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveFirstThreeCharsFromName",
        query = "SELECT * FROM COMPANIES WHERE LEFT(COMPANY_NAME, 3) = :SEARCHVALUE",
        resultClass = Company.class
)

@NamedNativeQuery(
        name = "Company.retrieveSearchedName",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE concat('%', :FRAGMENT, '%' )",
        resultClass = Company.class
)

@Entity
@Service
@Table(name = "COMPANIES")
public class Company {

    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies", fetch = FetchType.EAGER)
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
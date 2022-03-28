package com.kodilla.hibernate.manytomany.facade;


import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NamedNativeQuery;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Employee.retrieveSearchedName",
        query = "SELECT * FROM EMPLOYEES WHERE FIRSTNAME LIKE :'%FRAGMENT%' ",
        resultClass = Employee.class
)

@NamedNativeQuery(
        name = "Company.retrieveSearchedName",
        query = "SELECT * FROM COMPANIES WHERE COMPANY_NAME LIKE :'%FRAGMENT%' ",
        resultClass = Company.class
)


@Service
public class EmployeeCompanyFacade {

    @Autowired
    public EmployeeCompanyFacade () {
    }

    @Autowired
    private EmployeeDao employeeDao;

    List <Employee> employeesList = new ArrayList<>();

    List <Company> companyList = new ArrayList<>();

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> searchEmployee (String nameFragment) {

        return employeesList = employeeDao.retrieveSearchedName(nameFragment);
    }

    public List<Company>  searchCompany (String nameFragment) {
        return companyList = companyDao.retrieveSearchedName(nameFragment);
    }
}

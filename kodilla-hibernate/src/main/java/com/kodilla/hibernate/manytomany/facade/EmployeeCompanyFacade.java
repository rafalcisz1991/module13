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

@Service
public class EmployeeCompanyFacade {

    public EmployeeCompanyFacade(){
    }

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private CompanyDao companyDao;

    public List<Employee> searchEmployee (String nameFragment) {

        return employeeDao.retrieveSearchedName(nameFragment);
    }

    public List<Company>  searchCompany (String nameFragment) {
        return companyDao.retrieveSearchedName(nameFragment);
    }
}

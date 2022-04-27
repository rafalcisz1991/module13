package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeCompanyFacade {

    private final EmployeeDao employeeDao;
    private final CompanyDao companyDao;

    @Autowired
    public EmployeeCompanyFacade(EmployeeDao employeeDao, CompanyDao companyDao){
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> searchEmployee (String nameFragment) {return employeeDao.retrieveSearchedName(nameFragment);}

    public List<Company>  searchCompany (String nameFragment) {
        return companyDao.retrieveSearchedName(nameFragment);
    }
}

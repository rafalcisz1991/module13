package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.EmployeeCompanyFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private EmployeeCompanyFacade employeeCompanyFacade;

    @Test
    @Transactional
    void testSaveManyToMany() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        String actualFirstName = employeeDao.retrieveSoughtName("Kovalsky").get(0).getFirstname();
        String actualCompanyName = companyDao.retrieveFirstThreeCharsFromName("Sof").get(0).getName();
        String actualEmployee = companyDao.retrieveFirstThreeCharsFromName("Sof").
                get(0).getEmployees().get(0).getFirstname();

        assertNotEquals(0, softwareMachineId);
        assertNotEquals(0, dataMaestersId);
        assertNotEquals(0, greyMatterId);
        assertTrue(employeeDao.count() != 0);
        assertEquals(1, employeeDao.retrieveSoughtName("Smith").size());
        assertEquals("Linda", actualFirstName);
        assertTrue(companyDao.count() != 0);
        assertEquals(1, companyDao.retrieveFirstThreeCharsFromName("Sof").size());
        assertEquals("Software Machine", actualCompanyName);
        assertEquals("John", actualEmployee);

        //CleanUp
        try {
            companyDao.deleteById(softwareMachineId);
            companyDao.deleteById(dataMaestersId);
            companyDao.deleteById(greyMatterId);
        } catch (Exception e) {
            //do nothing
        }
    }

    @Test void testEmployeeNameFragmentSearch() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();

        //Then
        List<Employee> lookedEmployees = employeeCompanyFacade.searchEmployee("oh");
        assertTrue(lookedEmployees.size() > 0);
        String actualFirstName = lookedEmployees.get(0).getFirstname();
        String actualLastName = lookedEmployees.get(0).getLastname();
        List<Company> actualCompanies = lookedEmployees.get(0).getCompanies();
        String actualCompanyName = actualCompanies.get(0).getName();

        assertEquals(1, lookedEmployees.size());
        assertEquals("John", actualFirstName);
        assertEquals("Smith", actualLastName);
        assertTrue(actualCompanies.size() > 0);
        assertEquals(1, actualCompanies.size());
        assertEquals("Software Machine", actualCompanyName);

        //CleanUp
        try{
            companyDao.deleteById(softwareMachineId);
            employeeDao.deleteById(johnSmithId);
        } catch (Exception e) {

        }
    }

    @Test
    void testCompanyNameFragmentSearch() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Company softwareMachine = new Company("Software Machine");
        softwareMachine.getEmployees().add(johnSmith);
        johnSmith.getCompanies().add(softwareMachine);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        employeeDao.save(johnSmith);
        int johnSmithId = johnSmith.getId();

        //Then
        List<Company> lookedCompanies = employeeCompanyFacade.searchCompany("ftw");
        String actualCompanyName = lookedCompanies.get(0).getName();
        List<Employee> actualEmployees = lookedCompanies.get(0).getEmployees();
        String actualEmployeeFirstName = actualEmployees.get(0).getFirstname();
        String actualEmployeeLastName = actualEmployees.get(0).getLastname();

        assertTrue(lookedCompanies.size() > 0);
        assertEquals(1, lookedCompanies.size());
        assertEquals("Software Machine", actualCompanyName);
        assertTrue(actualEmployees.size() > 0);
        assertEquals("Smith", actualEmployeeLastName);
        assertEquals("John", actualEmployeeFirstName);
        assertEquals(1, actualEmployees.size());

        //CleanUp
        try{
            companyDao.deleteById(softwareMachineId);
            employeeDao.deleteById(johnSmithId);
        } catch (Exception e) {

        }
    }
}

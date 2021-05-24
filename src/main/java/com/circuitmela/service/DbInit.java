package com.circuitmela.service;


import com.circuitmela.model.Employee;
import com.circuitmela.repository.EmployeeRepository;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class DbInit {
    private  final EmployeeRepository employeeRepository;
    public DbInit(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @PostConstruct
    public void init(){
        Employee employee = new Employee();
        employee.setName("Abdul Halim");
        employee.setAddress("Dhaka");
        employee = employeeRepository.save(employee);
        System.out.println("E ID = "+employee.getId());
    }
}

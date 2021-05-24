package com.circuitmela.service;


import com.circuitmela.model.Address;
import com.circuitmela.model.Employee;
import com.circuitmela.repository.AddressRepository;
import com.circuitmela.repository.EmployeeRepository;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class DbInit {
    private  final EmployeeRepository employeeRepository;
    private  final AddressRepository addressRepository;
    public DbInit(EmployeeRepository employeeRepository, AddressRepository addressRepository){
        this.employeeRepository = employeeRepository;
        this.addressRepository = addressRepository;
    }

//    For Runtime Create or quick test
    @PostConstruct
    public void init(){
        Address address = new Address();
        address.setCity("Dhaka");
        address.setCountry("Bangladesh");
//        address = addressRepository.save(address); //For MERGE
        Employee employee = new Employee();
        employee.setName("Abdul Halim");
        employee.setAddress(address);
        employee = employeeRepository.save(employee);
        System.out.println("Employee ID = "+employee.getId());
        System.out.println("Address ID = "+address.getId());
//        Employee employee = employeeRepository.findById(Long.valueOf(1)).get();
//        employeeRepository.delete(employee);
    }
}

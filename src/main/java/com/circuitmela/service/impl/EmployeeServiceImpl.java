package com.circuitmela.service.impl;

import com.circuitmela.model.Employee;
import com.circuitmela.repository.EmployeeRepository;
import com.circuitmela.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Long id) {
        Employee employee = employeeRepository.findById(id).get();
        if(employee == null){
            return;
        }
        employeeRepository.delete(employee);
    }

    @Override
    public Employee get(Long id) {
        Employee employee = employeeRepository.findById(id).get();
//        if(employee == null){
//            return null;
//        }
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;
    }
}

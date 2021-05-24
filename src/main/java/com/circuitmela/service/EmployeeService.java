package com.circuitmela.service;

import com.circuitmela.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Employee employee);
    void delete(Long id);
    Employee get(Long id);
    List<Employee> getAll();
}

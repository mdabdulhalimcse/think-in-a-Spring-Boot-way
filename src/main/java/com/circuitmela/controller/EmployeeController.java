package com.circuitmela.controller;

import com.circuitmela.annotations.ApiController;
import com.circuitmela.model.Employee;
import com.circuitmela.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("/create")

    public Employee save( @RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
      employeeService.delete(id);
    }

    @GetMapping("/{id}")
    public Employee save(@PathVariable("id") Long id){
        return employeeService.get(id);
    }

    @GetMapping("/all")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
}

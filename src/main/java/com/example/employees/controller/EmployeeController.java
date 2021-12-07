package com.example.employees.controller;

import com.example.employees.model.Employee;
import com.example.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get/{id}")
    public Employee getMapping(@PathVariable(required = false, name="id") String id)
    {
        return (null != id) ? employeeService.findById(id) : null;

    }

    @PostMapping("/save")
    public String putMapping(@RequestBody Employee employee)
    {
        return 1 == employeeService.saveEmployee(employee) ? "Saved" : "Error while saving";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMapping(@PathVariable(required = false, name="id") String id)
    {
        return employeeService.deleteById(id);
    }

    @PutMapping
    public String postMapping(@RequestBody Employee employee)
    {
        return employeeService.update(employee);
    }

    @RequestMapping("/findAll")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }
}
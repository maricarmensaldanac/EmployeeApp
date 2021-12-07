package com.example.employees.service;

import com.example.employees.model.Employee;
import com.example.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    public Employee findById(String id)
    {
        return employeeRepository.findById(id);
    }

    public Integer saveEmployee(Employee employee){
        return employeeRepository.insert(employee);
    }

    public String deleteById(String id){
        return employeeRepository.deleteById(id);
    }

    public String update(Employee employee)
    {
        return employeeRepository.update(employee);
    }
}
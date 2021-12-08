package com.example.employees.service;

import com.example.employees.model.Employee;
import com.example.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll()
    {
        return orderByFirstName(employeeRepository.findAll());
    }

    public Employee findById(String id) { return employeeRepository.findById(id); }

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

    public Double getAgeAverage()
    {
        try {
            List<Employee> employees = employeeRepository.findAll();
            OptionalDouble result = employees.stream().mapToDouble(x -> x.getAge()).average();
            return result.getAsDouble();
        }catch (Exception e)
        {
            return new Double(0.0);
        }
    }

    public List<String> getUpperCaseNameList()
    {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(x -> x.getFirstName().toUpperCase()).collect(Collectors.toList());
    }

    public List<Employee> orderByFirstName(List<Employee> employees)
    {
        return employees
                .stream()
                .sorted((x,y) -> x.getFirstName().compareTo(y.getFirstName()))
                .collect(Collectors.toList());
    }}
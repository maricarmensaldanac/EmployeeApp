package com.example.employees.repository;

import com.example.employees.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Employee> findAll()
    {
        return jdbcTemplate.query("select * from Employee",
                new BeanPropertyRowMapper<>(Employee.class));
    }

    public Integer insert(Employee employee)
    {
        String sql = "INSERT INTO Employee(firstname, lastname, age)" +
                "VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getAge());

        return result;
    }

    public String deleteById(String id)
    {
        String sql = "DELETE FROM Employee WHERE idEmployee = ?";
        Object[] args = new Object[] {id};
        return jdbcTemplate.update(sql, args) == 1 ? "Deleted" : "Error";
    }

    public String update(Employee employee)
    {
        int result = jdbcTemplate.update("UPDATE Employee set firstName = '" + employee.getFirstName()
        + "' , lastName= '" + employee.getLastName() + "' ,age = " + employee.getAge()
        + " WHERE idEmployee = " + employee.getIdEmployee());

        return 1 == result ? "Updated" : "Error";
    }

    public Employee findById(String id)
    {
        return jdbcTemplate.queryForObject("SELECT * FROM Employee" +
                        " WHERE idEmployee = '" + id +"'",
                new BeanPropertyRowMapper<>(Employee.class));
    }
}
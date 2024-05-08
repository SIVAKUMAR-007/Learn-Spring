package com.example.employee.dao;

import com.example.employee.model.Employee;
import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployee();
    
    int addEmployee(Employee employee);
}
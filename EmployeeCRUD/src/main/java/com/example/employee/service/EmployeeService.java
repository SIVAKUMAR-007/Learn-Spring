package com.example.employee.service;

import com.example.employee.model.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployee();
    
    boolean addEmployee(Employee employee);
    
    boolean updateEmployee(Long id, Employee updatedEmployee);
    
    boolean deleteEmployee(Long id);
}

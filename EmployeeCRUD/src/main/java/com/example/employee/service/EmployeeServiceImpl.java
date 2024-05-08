package com.example.employee.service;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        int rowsAffected = employeeDao.addEmployee(employee);
        return rowsAffected > 0;
    }
}

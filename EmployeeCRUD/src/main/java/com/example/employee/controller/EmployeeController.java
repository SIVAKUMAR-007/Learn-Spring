package com.example.employee.controller;

import com.example.employee.model.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAllEmployee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }
    
    @PostMapping("/addEmployee")
    public String addEmployee(@RequestBody Employee employee) {
        boolean isAdded = employeeService.addEmployee(employee);
        return isAdded ? "Successfully added" : "Not added";
    }
    
    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        boolean isUpdated = employeeService.updateEmployee(id, updatedEmployee);
        return isUpdated ? "Successfully updated" : "Not updated";
    }
    
    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        boolean isDeleted = employeeService.deleteEmployee(id);
        return isDeleted ? "Successfully deleted" : "Not deleted";
    }





}

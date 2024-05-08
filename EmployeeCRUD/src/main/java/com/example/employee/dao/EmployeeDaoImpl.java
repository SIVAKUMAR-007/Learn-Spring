package com.example.employee.dao;

import com.example.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String SELECT_EMP_SQL = "SELECT * FROM EMPLOYEE";
	private static final String INSERT_EMP_SQL = "INSERT INTO EMPLOYEE (id, name) VALUES (?, ?)";

	@Override
	public List<Employee> getAllEmployee() {
		return jdbcTemplate.query(SELECT_EMP_SQL, new BeanPropertyRowMapper<>(Employee.class));
	}

	@Override
	public int addEmployee(Employee employee) {
		return jdbcTemplate.update(INSERT_EMP_SQL, employee.getId(), employee.getName());
	}

}

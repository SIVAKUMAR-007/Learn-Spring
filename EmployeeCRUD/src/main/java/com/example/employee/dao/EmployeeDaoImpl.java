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
	private static final String INSERT_EMP_SQL = "INSERT INTO EMPLOYEE (id, name, email) VALUES (?, ?, ?)";
	private static final String UPDATE_EMP_SQL = "UPDATE employee SET name = ?, email = ? WHERE id = ?";
	private static final String DELETE_EMP_SQL = "DELETE FROM employee WHERE id = ?";



	@Override
	public List<Employee> getAllEmployee() {
		return jdbcTemplate.query(SELECT_EMP_SQL, new BeanPropertyRowMapper<>(Employee.class));
	}

	@Override
	public int addEmployee(Employee employee) {
		return jdbcTemplate.update(INSERT_EMP_SQL, employee.getId(), employee.getName(), employee.getEmail());
	}

	@SuppressWarnings("unused")
	@Override
	public int updateEmployee(Long id, Employee updatedEmployee) {
	    String sql = "UPDATE employee SET name = ?, email = ? WHERE id = ?";
	    return jdbcTemplate.update(UPDATE_EMP_SQL, updatedEmployee.getName(), updatedEmployee.getEmail(), id);
	}

	 @Override
	    public int deleteEmployee(Long id) {
	        return jdbcTemplate.update(DELETE_EMP_SQL, id);
	    }


}

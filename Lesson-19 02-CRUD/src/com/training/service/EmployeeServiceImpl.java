package com.training.service;

import java.sql.Connection;
import java.util.List;

import com.training.bean.Employee;
import com.training.db1.DBConnectionFactory;
import com.training.db1.EmployeeDAO;
import com.training.db1.EmployeeJdbcImpl;

public class EmployeeServiceImpl implements EmployeeService{

	@Override
	public boolean addEmployee(Employee employee) throws Exception {
		boolean result=false;
		Connection connection=DBConnectionFactory.createConnection();
		EmployeeDAO dao=new EmployeeJdbcImpl();
		result=dao.addEmployee(connection, employee);
		return result;
	}

	@Override
	public boolean updateEmployee(Employee employee) throws Exception {
		
		return false;
	}

	@Override
	public boolean deleteEmployee(Employee employee) throws Exception {
		boolean result=false;
		Connection connection=DBConnectionFactory.createConnection();
		EmployeeDAO dao=new EmployeeJdbcImpl();
		result=dao.deleteEmployee(connection, employee);
		return result;
	}

	@Override
	public Employee findEmployee(int id) throws Exception {
		Connection connection=DBConnectionFactory.createConnection();
		EmployeeDAO dao=new EmployeeJdbcImpl();
		Employee employee=dao.findEmployee(connection, id);
		return employee;
	}

	@Override
	public List<Employee> findAllEmployees() throws Exception {
		Connection connection=DBConnectionFactory.createConnection();
		EmployeeDAO dao=new EmployeeJdbcImpl();
		return dao.findAllEmployees(connection);
	}

}














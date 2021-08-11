package com.fis.springjdbc.employee;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.fis.springjdbc.product.Product;
import com.fis.springjdbc.product.ProductMapper;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployee{

	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "insert into employee values(?,?)";
		Object[] args = { employee.getId(), employee.getName() };
		int insertedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Inserted: " + insertedRows);
	}

	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String sql = "select * from product";
		List<Employee> employee = getJdbcTemplate().query(sql, new EmployeeMapper());
		return employee;
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update employee set name=? where id=?";
		Object[] args = { employee.getName(), employee.getId() };
		int updatedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Updated: " + updatedRows);
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from employee where id=?";
		Object[] args = { id };
		int deletedRows = getJdbcTemplate().update(sql, args);
		System.out.println("Rows Deleted: " + deletedRows);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from product where id=?";
		Object[] args = { id };
		Employee employeeById = getJdbcTemplate().queryForObject(sql, args, new EmployeeMapper());
		return employeeById;
	}

}

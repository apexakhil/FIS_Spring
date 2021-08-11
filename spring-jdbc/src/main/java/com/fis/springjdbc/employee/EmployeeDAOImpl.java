package com.fis.springjdbc.employee;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.fis.springjdbc.product.Product;
import com.fis.springjdbc.product.ProductMapper;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployee{

	@Override
	public void insertEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		String sql = "select * from product";
		List<Employee> products = getJdbcTemplate().query(sql, new ProductMapper());
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}

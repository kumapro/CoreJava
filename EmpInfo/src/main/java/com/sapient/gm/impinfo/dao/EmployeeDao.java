package com.sapient.gm.impinfo.dao;

import java.util.List;

import com.sapient.gm.impinfo.model.Employee;

public interface EmployeeDao {

	public void save(Employee employee);

	public List<Employee> list();
}

package com.sapient.gm.impinfo.dao;

import java.util.List;

import org.hibernate.Session;

import com.sapient.gm.impinfo.client.SessionFactoryUtil;
import com.sapient.gm.impinfo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Override
	public void save(Employee employee) {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.persist(employee);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public List<Employee> list() {
		Session session = SessionFactoryUtil.getSessionFactory().openSession();
		List<Employee> emps = session.createQuery("from emp").list();
		session.close();
		return emps;
	}

}

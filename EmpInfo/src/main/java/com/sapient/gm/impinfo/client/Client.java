package com.sapient.gm.impinfo.client;

import java.util.List;

import com.sapient.gm.impinfo.dao.EmployeeDao;
import com.sapient.gm.impinfo.dao.EmployeeDaoImpl;
import com.sapient.gm.impinfo.model.Employee;
import com.sapient.gm.impinfo.parser.ParseEmployeeFromXML;
import com.sapient.gm.impinfo.rule.SalaryLimitNotifier;

public class Client {

	public static void main(String[] args) {
		ParseEmployeeFromXML parser = new ParseEmployeeFromXML();
		List<Employee> emps = parser.parseEmployee();
		EmployeeDao dao = new EmployeeDaoImpl();
		SalaryLimitNotifier notifier = new SalaryLimitNotifier();
		for(Employee e: emps){
			notifier.alert(e);
			dao.save(e);
		}

	}

}

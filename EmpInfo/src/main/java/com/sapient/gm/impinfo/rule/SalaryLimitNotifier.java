package com.sapient.gm.impinfo.rule;

import com.sapient.gm.impinfo.model.Alert;
import com.sapient.gm.impinfo.model.Employee;

public class SalaryLimitNotifier implements Notifier {

	@Override
	public void alert(Employee employee) {
		if(employee.getSalary() > 1500000){
			Alert alert = new Alert();
			alert.setEmployee(employee);
			employee.setAlert(alert);
		}
	}

}

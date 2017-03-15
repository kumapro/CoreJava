package com.sapient.gm.impinfo.rule;

import com.sapient.gm.impinfo.model.Employee;

public interface Notifier {
	public void alert(Employee employee);
}

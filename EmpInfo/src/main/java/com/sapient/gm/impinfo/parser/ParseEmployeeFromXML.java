package com.sapient.gm.impinfo.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.sapient.gm.impinfo.model.Employee;
import com.sapient.gm.impinfo.model.Employees;

public class ParseEmployeeFromXML implements EmpParser {

	@Override
	public List<Employee> parseEmployee() {
		List<Employee> emps = new ArrayList<>();
		File file = new File("src/main/resources/emoloyees.xml");
		try {
			JAXBContext context = JAXBContext.newInstance(Employees.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Employees employees = (Employees) unmarshaller.unmarshal(file);
			emps = employees.getEmployes();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return emps;
	}

}

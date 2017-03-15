package com.sapient.gm.impinfo.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees {
	
	 @XmlElement(name = "employee")
	private List<Employee> employes;

	public List<Employee> getEmployes() {
		return employes;
	}

}

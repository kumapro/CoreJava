package com.learnjavabyexample.core.customimplementation.hashmap;

public class CientForCustomClass {

	public static void main(String[] args) {
		CustomHashMap<Employee, Employee> chm = new CustomHashMap<>();
		Employee employee1 = new Employee(1, "name 1");
		Employee employee2 = new Employee(2, "name 2");
		Employee employee3 = new Employee(3, "name 3");
		Employee employee4 = new Employee(4, "name 4");
		Employee employee5 = new Employee(5, "name 5");
		Employee employee6 = new Employee(6, "name 6");
		Employee employee7 = new Employee(7, "name 7");
		Employee employee8 = new Employee(8, "name 8");
		Employee employee9 = new Employee(9, "name 9");
		Employee employee10 = new Employee(10, "name 10");
		Employee employee11 = new Employee(11, "name 11");
		Employee employee12 = new Employee(12, "name 12");
		Employee employee13 = new Employee(13, "name 13");
		Employee employee14 = new Employee(14, "name 14");
		
		chm.put(employee1, employee1);
		chm.put(employee2, employee2);
		chm.put(employee3, employee3);
		chm.put(employee4, employee4);
		chm.put(employee5, employee5);
		chm.put(employee6, employee6);
		chm.put(employee7, employee7);
		chm.put(employee8, employee8);
		chm.put(employee9, employee9);
		chm.put(employee10, employee10);
		chm.put(employee11, employee11);
		chm.put(employee12, employee12);
		chm.put(employee13, employee13);
		chm.put(employee14, employee14);
		
		System.out.println("print all node of map before any other operation");
		
		chm.printHashMap();
		
		System.out.println("\nget details of employee 12 ");
		Employee employee = chm.get(employee12);
		System.out.println(employee);
		
		System.out.println("\nsize of map before remove");
		System.out.println(chm.size());
		
		System.out.println("removing employee11");
		chm.remove(employee11);
		
		System.out.println("\nsize of map after remove");
		System.out.println(chm.size());
		
		System.out.println("print all node of map after all other operation");
		
		chm.printHashMap();

	}

}

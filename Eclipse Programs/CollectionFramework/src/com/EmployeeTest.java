package com;

import java.util.ArrayList;
import java.util.TreeSet;

import bean.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		TreeSet<String> names = new TreeSet<String>();
		names.add("Mahesh"); names.add("Rajesh"); names.add("Ajay");
		System.out.println(names);
		*/
		TreeSet<Employee> ts = new TreeSet<Employee>();
		Employee emp1 =new Employee(103,"Vijay",12000);
		Employee emp2 = new Employee(101, "Ramesh", 16000);
		Employee emp3 = new Employee(102,"Lokesh",19000);
		Employee emp4 = new Employee(104,"Lokesh Kumar",17000);
		ts.add(emp1); ts.add(emp2); 
		ts.add(emp3); ts.add(emp4);
		//System.err.println(ts);
		System.out.println(ts.size());
	}

}

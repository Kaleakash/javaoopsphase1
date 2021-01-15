package main;

import bean.Employee;

public class DemoTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
		emp1.setSalary(12000);
		
		Employee emp2 = new Employee(100,"Ravi",12000);
		
		Employee emp4 = new Employee();
		Employee emp3 = emp2;
		
		if(emp1.equals(null)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
		
		/*Employee emp = new Employee();
		//emp.id=100;
		//emp.name="Ravi";
		//emp.salary=-12000;
		emp.setId(100);
		emp.setName("Ravi");
		emp.setSalary(-12000);
		
		System.out.println("Id is "+emp.getId());
		System.out.println("Name is "+emp.getName());
		System.out.println("Salary is "+emp.getSalary());
		System.out.println(emp);*/
	}

}

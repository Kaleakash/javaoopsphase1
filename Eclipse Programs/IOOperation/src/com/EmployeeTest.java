package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*Employee emp1 = new Employee(100,"Ravi",12000);
		emp1.display();
		FileOutputStream fos = new FileOutputStream("employee.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp1);
		System.out.println("Object Serialization done successfully!");
		fos.close();
		*/
		
		FileInputStream fis = new FileInputStream("employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee)ois.readObject();
		emp.display();
		System.out.println("De-Serialization done successfully...");
		
	}

}

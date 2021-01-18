package com;

import java.io.DataInputStream;
import java.io.PrintStream;

public class DataInputStreamOperation {

	public static void main(String[] args) throws Exception{
	DataInputStream dis = new DataInputStream(System.in);
	PrintStream ps = System.out;
	ps.println("Enter the id");
	int id  = Integer.parseInt(dis.readLine());		// converting string to int 
	ps.println("Enter the name");
	String name = dis.readLine();
	ps.println("Enter the salary");
	float salary = Float.parseFloat(dis.readLine());
	ps.println("id is "+id);
	ps.println("Your Name is "+name);
	ps.println("Salary is "+salary);
	}

}

package com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * Character 
 * 	Source --> Keyboard 
 * Destination --> Console 
 * 
 */
public class CharacterClassesIOOperation {
	public static void main(String[] args) throws Exception{
	//InputStreamReader isr = new InputStreamReader(System.in);
	//BufferedReader br = new BufferedReader(isr);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the id");
	int id  = Integer.parseInt(br.readLine());
	System.out.println("Enter the name");
	  String name = br.readLine();
	  System.out.println("Enter the salary");
	 float salary = Float.parseFloat(br.readLine());
	 System.out.println("id is "+id);
	  System.out.println("Name is "+name);
	  System.out.println("Salary is "+salary);
	}
}

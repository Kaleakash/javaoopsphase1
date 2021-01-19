package com;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PrimitiveOperation {
	public static void main(String[] args) throws Exception{
		// Store primitive value 
		/*int id=100;
		String name = "Ramesh Kumar";
		float salary = 34000;
		
		FileOutputStream fos = new FileOutputStream("emp.txt");		// connect to file 
		
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeInt(id);
		dos.writeUTF(name);
		dos.writeFloat(salary);
		System.out.println("Record stored successfully...");*/
		
		//Read primitive values 
		FileInputStream fis = new FileInputStream("emp.txt");
		DataInputStream dis = new DataInputStream(fis);		
				int id = dis.readInt();
				String name = dis.readUTF();
				float salary = dis.readFloat();
				System.out.println("id is "+id);
				System.out.println("name is "+name);
				System.out.println("salary is "+salary);
	}

}

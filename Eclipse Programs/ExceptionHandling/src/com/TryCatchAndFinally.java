package com;

public class TryCatchAndFinally {

	public static void main(String[] args) {
		try {
		int i=10/1;												//open file 
		System.out.println("No Exception");		// read and write 
																	
		} catch (Exception e) {
			System.out.println("Catch block");			//close file 
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Normal statement");
	}

}

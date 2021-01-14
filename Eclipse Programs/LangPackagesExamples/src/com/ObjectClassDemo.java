package com;

class Employee {
	public String toString() {
		return "This Employee class Object";
	}
	public void finalize() {
		System.out.println("Before GC to clean the Resource ");
	}
}
public class ObjectClassDemo {

	public static void main(String[] args) {
	Employee emp = new Employee();
	System.out.println(emp);
	emp = null;		// Elgible for GC
	System.gc();     // Request for GC
	System.out.println("hello");
	}

}

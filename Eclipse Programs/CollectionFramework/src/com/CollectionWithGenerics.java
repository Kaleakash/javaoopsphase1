package com;

import java.util.ArrayList;

public class CollectionWithGenerics {
	
	public static void main(String[] args) {
	/*	ArrayList al = new ArrayList();
		int a=10;
		Integer i = new Integer(a);		//converting primitive to objects. 
		al.add(i);				
		al.add(100);			//auto-boxing : converting primitive to objects. 
		al.add("Ravi");
		al.add(10.10);
		
		Object obj	 = al.get(2);
		Integer ii = (Integer)obj;		// down level type casting 
		int n = ii.intValue();			// conveting object to primitive 
		System.out.println(n);
		*/
		//Collection framework with generics. 
		//
		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add("Ravi");
		al1.add(true);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);					// auto-boxing : converting primitive to object. 
		al.add(20);
		al.add(30);
		
		int n	 = al.get(0);		// auto-unboxing : converting object to primitive 
		System.out.println(n);
	}
}

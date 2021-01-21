package com;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("Size is "+al.size());
		System.out.println("Empty "+al.isEmpty());
		al.add(100);
		al.add(10.20);
		al.add("Ramesh");
		al.add(30);
		System.out.println("Size is "+al.size());
		System.out.println("Empty "+al.isEmpty());
		
	}

}

package com;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al);
	System.out.println("Value in Zero Position "+al.get(0));
	System.out.println("Value in 1 Position "+al.get(1));
	al.add(1, 100);
	System.out.println("Value in Zero Position "+al.get(0));
	System.out.println("Value in 1 Position "+al.get(1));
	al.remove(2);			// remove the value using index. 
	al.remove(new Integer(40));
	System.out.println(al);
	}

}

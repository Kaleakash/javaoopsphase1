package com;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsDemo {
	public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<String>();
	names.add("Ramesh");
	names.add("Rajesh");
	names.add("Ajay");
	names.add("Vikash");
	names.add("Lokesh");
	System.out.println("Before Sort");
	for(String name:names) {
		System.out.print(name+" ");
	}
	Collections.sort(names);
	System.out.println();
	System.out.println("AFter sort");
	for(String name:names) {
		System.out.print(name+" ");
	}
	int res1 = Collections.binarySearch(names, "Vikash");
	int res2 = Collections.binarySearch(names, "Ramesh");
	int res3 = Collections.binarySearch(names, "Akash");
	System.out.println();
	System.out.println("Res1 is "+res1);
	System.out.println("Res2 is "+res2);
	System.out.println("Res3 is "+res3);
	}

}


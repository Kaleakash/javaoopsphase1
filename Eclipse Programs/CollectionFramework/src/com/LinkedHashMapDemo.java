package com;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		//HashSet hs = new HashSet();
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(3);
		hs.add(2);
		hs.add("abc");
		hs.add(5);
		hs.add(6);
		hs.add(5);
		System.out.println(hs);

	}

}

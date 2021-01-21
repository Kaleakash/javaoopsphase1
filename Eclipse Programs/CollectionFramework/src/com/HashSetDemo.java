package com;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		hs.add(3);
		hs.add(2);
		hs.add(1);
		hs.add(5);
		hs.add(6);
		hs.add(5);
		System.out.println(hs);
		System.out.println("Size "+hs.size());
		System.out.println("Empty "+hs.isEmpty());
		System.out.println("Search "+hs.contains(5));
		System.out.println("Search "+hs.contains(7));
		hs.remove(3);
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);
	}

}

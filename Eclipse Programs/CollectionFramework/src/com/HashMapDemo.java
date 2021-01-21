package com;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
	HashMap hm = new HashMap();
	hm.put(2, "Ramesh");
	hm.put(3, "Ajay");
	hm.put(1, "Dinesh");
	hm.put(4, "Lokesh");
	System.out.println(hm);
	hm.put(1, "Balaji");
	hm.put(6, "Ramesh");
	System.out.println(hm);
	if(!hm.containsKey("1")) {
				hm.put(1, "Meeta");
	}
	System.out.println(hm);
	}

}

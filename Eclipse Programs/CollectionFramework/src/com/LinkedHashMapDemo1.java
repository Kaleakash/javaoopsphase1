package com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
	HashMap hm  = new HashMap();
	//LinkedHashMap hm = new LinkedHashMap();
	//TreeMap hm = new TreeMap();
//		Hashtable hm = new Hashtable();
	hm.put(2,"Ramesh");
	hm.put(1,"Lokesh");
	hm.put(4,"Suresh");
	hm.put(3,"Rakesh");
	hm.put("Ravi", "Kumar");
	hm.put(null, "Patil");
	hm.put(null, "Kumari");
	hm.put(8, null);
	
	System.out.println(hm);
	}

}

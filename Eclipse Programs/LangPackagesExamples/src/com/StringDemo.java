package com;

public class StringDemo {

	public static void main(String[] args) {
		/*String str1 = "Welcome to Java Training";
		String str2 = new String("Welcome to Java Training");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.substring(5));
		System.out.println(str2.substring(8, 15));//start count 0, end count 1 or size -1
		System.out.println(str1.contains("Java"));
		System.out.println(str1.contains("Python"));
		System.out.println(str1.replace("Java", "Python"));*/
		/*String name1 = "Raj";				//New memory created...
		String name2 = "Raj";				// refer to same memory 
		String name3 = new String("Raj");		//new memory 
		String name4 = new String("Raj");		//new memory 
		if(name1.equals(name4)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}*/
		String str = "Raj Deep";
		System.out.println(str);
		System.out.println(str.toLowerCase());	
		
		System.out.println(str);
		
		System.out.println("Using String buffer");
		StringBuffer sb = new StringBuffer("Raj Deep");
		System.out.println(sb);
		System.out.println(sb.delete(2, 5));
		
		System.out.println(sb);
	}

}

package com;

public class TryAndCatchDemo {

	public static void main(String[] args) {
	System.out.println("Hi");
	int a=10;
	int b=1;
	int abc[]= {10,20,30,40};
				try {
				int res = a/b;
				System.out.println(res);
				int res1  = 10/abc[6];
				}catch (Exception e) {
					//System.out.println("I Take Care!");
					System.out.println(e.toString());
				}
	System.out.println("Bye");
	System.out.println("Byte");
	}

}

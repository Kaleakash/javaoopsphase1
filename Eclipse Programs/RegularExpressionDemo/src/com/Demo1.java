package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {

	public static void main(String[] args) {
		// To match extact things 
		
		/*Pattern pt = Pattern.compile("simplilearn");
		Matcher mt =pt.matcher("simplilearn");
		if(mt.matches()) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}*/
		//Search one or more than one chracter present in text. 
		
		/*Pattern pt = Pattern.compile("Java");
		Matcher mt = pt.matcher("Welcome to Java Training, Java is object orietned programming and Java is use to create app!");
		while(mt.find()) {
			//System.out.println("yes");
			System.out.println("Start "+mt.start()+"End "+mt.end());
		}*/
		
		//String str ="P";		//Start with P character
		//String str ="[ABC]";		//name must be start with A or B or C character 
		//String str ="[A-M]";			// Name can start any character between A to M
		//String str ="[^ABC]";			// Name can start apart from A,B and C
		/*String str = "[0123]";			//number can start with 0,1,2,3.
		Pattern pt = Pattern.compile(str); 
		Matcher mt = pt.matcher("1567");
		if(mt.find()) {
			System.out.println("Started with that character");
		}else {
			System.out.println("not Start with that charater ");
		}*/
		/*Pattern pt = Pattern.compile("\\d{10}");		// simple pattern for valid phnumber 
		Matcher mt  = pt.matcher("9876543159");
		if(mt.matches()) {
			System.out.println("Valid");
		}else {
			System.out.println("InValid");
		}*/
		
		Pattern pt = Pattern.compile("[a-z,A-Z]+@[a-z,A-Z]+\\.com");
		Matcher mt = pt.matcher("a@x.com");
		if(mt.matches()) {
			System.out.println("Valid Email id");
		}else {
			System.out.println("InValid Email Id");
		}
	}
}

package com;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) throws Exception{
	/*File f1 =new File("C:\\Users\\91990\\Desktop\\filedetails\\a.txt");
	System.out.println("Name of the file "+f1.getName());
	System.out.println("Parent of the file "+f1.getParent());
	System.out.println("Path of the file "+f1.getAbsolutePath());
	System.out.println("Can we read the file "+f1.canRead());
	System.out.println("Can we write the file "+f1.canWrite());*/
	/*	
	File f1 = new File("C:\\Users\\91990\\Desktop\\filedetails\\c.txt");
	boolean res  = f1.createNewFile();
	if(res) {
		System.out.println("File created");
	}else {
		System.out.println("File didn't create.. becuase file already present");
	}
	*/
	/*File f2 = new File("C:\\Users\\91990\\Desktop\\filedetails\\");
	String str[] = f2.list();
		for(String fileName:str) {
			System.out.println(fileName);
		}
		*/
		File f3 = new File("C:\\Users\\91990\\Desktop\\filedetails\\b.txt");
		boolean res  =f3.delete();
		if(res) {
			System.out.println("Filete deleted..");
		}else {
			System.out.println("File not present");
		}
	}
		

}

package com;
/*
 * Source -->File 
 * Destination --> File / Console 
 */
import java.io.*;

public class FileInputStreamAndFileOutputStream {

	public static void main(String[] args) throws Exception{
	FileInputStream fis = new FileInputStream("C:\\Users\\91990\\Desktop\\ArrayDemo.java");
	FileOutputStream fos = new FileOutputStream("C:\\Users\\91990\\Desktop\\sample.txt");
	int ch;
	while((ch=fis.read()) != -1) {		//-1 EOF end of the file 
		//System.out.print((char)ch);
		fos.write(ch);	
	}
	fis.close();
	fos.close();
	System.out.println("File copied...");
	}
}

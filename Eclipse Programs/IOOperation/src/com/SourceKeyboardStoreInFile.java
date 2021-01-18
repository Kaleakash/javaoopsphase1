package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class SourceKeyboardStoreInFile {

	public static void main(String[] args) throws Exception {
		DataInputStream dis  =new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("demo.txt");
		System.out.println("Enter the text");
		int ch;
		while((ch = dis.read()) != '@') {
				System.out.print(ch+"="+(char)ch+" ");
				fos.write(ch);
		}
		fos.close();
	}

}

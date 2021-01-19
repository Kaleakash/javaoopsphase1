package com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedByteOperation {

	public static void main(String[] args) throws Exception{
	FileInputStream fis = new FileInputStream("abc.txt");
	BufferedInputStream bis = new BufferedInputStream(fis);		// improve input operation 
	FileOutputStream fos = new FileOutputStream("demo.doc");
	BufferedOutputStream bos = new BufferedOutputStream(fos);	//improve output operation
	int ch;
	while((ch=bis.read()) != -1) {
				bos.write(ch);
	}
	
	bos.flush();			// send to data to actual file after more than one operation 
	fis.close();
	fos.close();
	System.out.println("File copied...");
	}

}

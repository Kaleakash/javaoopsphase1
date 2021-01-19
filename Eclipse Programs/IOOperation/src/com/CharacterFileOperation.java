package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterFileOperation {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("C:\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("D:\\test1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int ch;
		while((ch=br.read()) != -1) {
			bw.write(ch);
		}
		bw.flush();    // Send the Data to Output file 
		fr.close();
		fw.close();
		System.out.println("File operation done");
	}

}

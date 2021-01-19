package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CharaterFileOperationDemo {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\test.txt");
		BufferedReader br = new BufferedReader(fr);
		int ch;
		int countWord=1;
		int specificCharacter=0;
		while((ch=br.read()) != -1) {
					if((char)ch == ' ') {
						countWord++;
					}
					if((char)ch=='e') {
						specificCharacter++;
					}
		}
		System.out.println("Number of words are "+countWord);
		System.out.println("Number of times e character is present is "+specificCharacter);
	}

}

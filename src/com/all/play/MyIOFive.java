package com.all.play;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class MyIOFive {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fileReader = new FileReader("demo.txt");
		
//		int ch=0;
//		
//		while((ch=fileReader.read())!=-1) {
//			System.out.print((char)ch);
//		}
		
		char[] buf=new char[1024];
		int num=0;
		while((num=fileReader.read(buf))!=-1) {
			System.out.println(new String(buf,0,num));
		}
		
		fileReader.close();
	}

}

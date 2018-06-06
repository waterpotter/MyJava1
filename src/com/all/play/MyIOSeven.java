package com.all.play;

import java.io.FileReader;

public class MyIOSeven {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileReader fileReader = new FileReader("demotwo.txt");
		
		char[] ch=new char[1024];
		
		int num=0;
		while((num=fileReader.read(ch))!=-1){
			System.out.println(new String(ch,0,num));
		}
		
		fileReader.close();
		
		
		
	}

}

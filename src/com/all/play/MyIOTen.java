package com.all.play;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyIOTen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("buf.txt");
		
		char[] bchar=new char[4];
		
		int read = fr.read(bchar);
		  
		System.out.println(read);

	}

}

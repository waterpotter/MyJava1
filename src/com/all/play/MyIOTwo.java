package com.all.play;

import java.io.FileWriter;
import java.io.IOException;

public class MyIOTwo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//test1();
		
		//new FileWriter("demotwo.txt");
		

	}

	private static void test1() throws IOException {
		FileWriter fw = new FileWriter("demo.txt");
		
		fw.write("哈士奇");
		
		fw.close();
	}

}

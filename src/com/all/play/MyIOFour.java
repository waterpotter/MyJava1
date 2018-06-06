package com.all.play;

import java.io.FileWriter;
import java.io.IOException;

public class MyIOFour {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		FileWriter fileWriter = new FileWriter("demo.txt",true);
		fileWriter.write("\r\n金毛\r\n德牧");
		
		fileWriter.close();
		

	}

}

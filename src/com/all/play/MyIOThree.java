package com.all.play;

import java.io.FileWriter;
import java.io.IOException;

public class MyIOThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fileWriter=null;
		try {
			fileWriter = new FileWriter("demotwo.txt");
			fileWriter.write("萨摩耶");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}finally {
			
				try {
					if(fileWriter!=null) {
					fileWriter.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					System.out.println(e.toString());
				}
			
		}

	}

}

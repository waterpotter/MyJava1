package com.all.play;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIOEight {

	/**
	 * 步骤： 1，在D盘创建一个文件。用于存储C盘文件中的数据。 2，定义读取流和C盘文件关联。 3，通过不断的读写完成数据存储。 4，关闭资源。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fileReader = null;
		FileWriter fileWriter = null;

		try {
			fileReader = new FileReader("demotwo.txt");
			fileWriter = new FileWriter("copydemotwo.txt",true);
		
			char[] ch=new char[1024];
			int num=0;
			while((num=fileReader.read(ch))!=-1) {
				fileWriter.write(ch, 0, num);
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}finally {
			
			try {
				if(fileReader!=null) {
					fileReader.close();
				}
			} catch (Exception e2) {
				System.out.println(e2.toString());
			}
			
			try {
				if(fileWriter!=null) {
					fileWriter.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
				System.out.println(e2.toString());
			}
			
			
		}

	}

}

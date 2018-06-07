package com.all.play;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyIOTen {

	public static void main(String[] args) throws IOException {
//		test1();
		
		//test2();
		
		
		
		
		

	}

	private static void test2() throws IOException {
		BufferedReader bufr=null;
		BufferedWriter bufw=null;
		
		try {
			bufr=new BufferedReader(new FileReader("buf.txt"));
			bufw=new BufferedWriter(new FileWriter("new_buf.txt"));
			
			String bstr=null;
			//readline  不读取换行,只读取有效数据;返回读取的数据[字符串]
			while((bstr=bufr.readLine())!=null) {
				bufw.write(bstr);
				bufw.newLine();
				bufw.flush();
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(bufr!=null) {
				bufr.close();
			}
			
			if(bufw!=null) {
				bufw.close();
			}
			
		}
	}

	/**
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static void test1() throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("buf.txt");
		
		char[] bchar=new char[4];
		
		int read = fr.read(bchar);
		  
		System.out.println(read);
	}

}

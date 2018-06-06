package com.all.play;

import java.io.FileReader;
import java.io.FileWriter;

public class MyIOEight_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fwWriter=null;
		FileReader frReader=null;
		
		try {
			fwWriter=new FileWriter("fw_copy.txt",true);
			frReader=new FileReader("copydemotwo.txt");
			
			char[] cha=new char[1024];
			int ch=0;
			while((ch=frReader.read(cha))!=-1) {
				fwWriter.write(cha, 0, ch);
				fwWriter.write("\r\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}finally {
			
			try {
				if(frReader!=null) {
					frReader.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				if(fwWriter!=null) {
					fwWriter.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
			
			
			
		}

	}

}

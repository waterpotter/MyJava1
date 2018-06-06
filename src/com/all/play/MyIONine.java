package com.all.play;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyIONine {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("buf.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		for (int i = 0; i < 5; i++) {
			bw.write("abcde" + i);
			bw.newLine();
			bw.flush();

		}

		bw.close();

	}

}

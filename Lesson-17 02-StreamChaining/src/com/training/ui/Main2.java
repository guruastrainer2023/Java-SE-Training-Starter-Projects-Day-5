package com.training.ui;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main2 {

	public static void main(String[] args) throws IOException {
		InputStream is;
		is = new FileInputStream("info.txt");
		
		byte[] content=new byte[is.available()];
		
		is.read(content);
		
		for(byte b:content){
			char ch=(char)b;
			System.out.print(ch);
		}
		
		is.close();

	}

}

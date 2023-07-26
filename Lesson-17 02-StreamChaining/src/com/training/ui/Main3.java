package com.training.ui;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main3 {

	public static void main(String[] args) throws IOException {
		Reader reader;
		
		InputStream is=new FileInputStream("info.txt");
		reader=new InputStreamReader(is);
		
		char[] content=new char[is.available()];
		
		reader.read(content);
		
		for(char c:content){
			System.out.print(c);
		}
		
		reader.close();
		is.close();

	}

}

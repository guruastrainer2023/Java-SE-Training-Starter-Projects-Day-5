package com.training.ui;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main5 {

	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		Reader reader=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(reader);
		
		System.out.println("Enter Some Input : ");
		String str=br.readLine();
		int i=Integer.parseInt(str);
		//System.out.println(i);
		
		
		
		
		br.close();
		reader.close();
		is.close();
		

	}

}

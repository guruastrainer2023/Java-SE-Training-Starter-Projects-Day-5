package com.training.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main1 {

	public static void main(String[] args) throws IOException {
		InputStream is=System.in;
		Reader reader=new InputStreamReader(is);
		BufferedReader br=new BufferedReader(reader);
		
		while(true) {
			System.out.println("Type Q to Exit ");
			String s=br.readLine();
			if(s.equalsIgnoreCase("Q"))
				System.exit(0);
			if(s!=null) {
				System.out.println(s.trim());
			}
			
		}
		
	}
}

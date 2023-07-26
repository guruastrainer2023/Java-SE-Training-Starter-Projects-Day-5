package com.training.ui;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br;

		Reader reader;

		InputStream is = new FileInputStream("info.txt");
		reader = new InputStreamReader(is);
		br = new BufferedReader(reader);

		while (true) {
			String str = br.readLine();
			if (str == null)
				break;
			System.out.println(str);
		}
		
		br.close();
		reader.close();
		is.close();

	}

}

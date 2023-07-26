package com.training.ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		try(
				BufferedReader br=new BufferedReader
					(new FileReader("MyFiles\\Personal\\Favourites\\actors.txt")))
		{
			br.lines().forEach((line)->{System.out.println(line);});
		}

	}

}

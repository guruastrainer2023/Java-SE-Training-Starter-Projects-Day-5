package com.training.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main2 {

	public static void main(String[] args)  {
		
		try(
			Stream<String> linesStream=Files.lines(Paths.get("MyFiles","Personal","Favourites","actors.txt"))	
			)
		{
			linesStream.forEach((line)->{System.out.println(line);});
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}

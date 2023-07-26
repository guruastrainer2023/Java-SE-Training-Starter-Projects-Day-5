package com.training.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main3 {

	public static void main(String[] args) {
		Path p=Paths.get("MyFiles","Personal","Favourites","actors.txt");
		List<String> contentList=null;
		
		try {
			contentList=Files.readAllLines(p);
			contentList
				.stream()
				.forEach(
						(line)-> System.out.println(line)
				);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}

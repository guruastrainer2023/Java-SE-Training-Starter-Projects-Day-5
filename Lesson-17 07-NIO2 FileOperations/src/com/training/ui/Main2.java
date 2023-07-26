package com.training.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

	public static void main(String[] args) throws IOException {
		Path p1=Paths.get("MyFiles","Personal","Favourites","actors.txt");
		Path p2=Paths.get("MyFiles","Personal","Favourites","actors1.txt");
		
		Files.copy(p1, p2);
		
		System.out.println(p1 + " Copied to "+ p2);

	}

}

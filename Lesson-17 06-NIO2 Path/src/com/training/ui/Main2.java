package com.training.ui;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

	public static void main(String[] args) {
		FileSystem fs=FileSystems.getDefault();
		Path p1=fs.getPath("MyFiles/Academic/qualification.txt");
		System.out.println(p1);
		
		// or
		
		Path p2=Paths.get("MyFiles/Academic/qualification.txt");
		System.out.println(p2);
		
		// or
		
		Path p3=Paths.get("MyFiles/Personal","Favourites","cricketers.txt");
		System.out.println(p3);

	}

}

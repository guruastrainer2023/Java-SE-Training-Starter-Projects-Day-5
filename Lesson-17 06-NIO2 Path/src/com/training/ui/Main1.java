package com.training.ui;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

	public static void main(String[] args) {
		
		// Resolve Method Example
		
		Path path1=Paths.get("MyFiles/Academic");
		Path path2=path1.resolve("qualifications.txt");
		
		System.out.println(path2);
		
		System.out.println(Paths.get("techskills.txt").resolve("MyFiles/Academic"));

	}

}

package com.training.ui;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main5 {

	public static void main(String[] args) {
		
		// Sub Path Example
		
		Path p1=Paths.get("MyFiles/Personal/Favourites/cricketers.txt");
		Path p2=p1.subpath(1, 3);
		
		System.out.println(p2);
		
		

	}

}

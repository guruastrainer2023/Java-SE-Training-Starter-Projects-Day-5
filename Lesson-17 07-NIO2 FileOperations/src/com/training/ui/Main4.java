package com.training.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main4 {

	public static void main(String[] args) throws IOException {
		Path p1=Paths.get("MyFiles","Personal","Favourites", "musicians.txt");
		//Files.delete(p1);
		
		//System.out.println(p1 + " File Deleted.");
		
		
		Path p2=Paths.get("MyFiles","Official","temp","f1.txt");
		Path p3=Paths.get("MyFiles","Official","temp","f2.txt");
		
		Files.deleteIfExists(p2);
		Files.deleteIfExists(p3);
		
		Path p4=Paths.get("MyFiles","Official","temp");
		Files.deleteIfExists(p4);
		
		System.out.println(p4 + " Folder Deleted");

	}

}

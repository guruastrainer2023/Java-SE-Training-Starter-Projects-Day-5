package com.training.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

	public static void main(String[] args) throws IOException {
		
		Path newFilePath=Paths.get("MyFiles","Personal","Favourites","singers.txt");
		Files.createFile(newFilePath);
		
		System.out.println("File Created : "+ newFilePath);
		
		Path newFolderName=Paths.get("MyFiles","Official","Projects");
		Files.createDirectories(newFolderName);
		
		System.out.println("Folder Created : "+ newFolderName);

		
	}

}

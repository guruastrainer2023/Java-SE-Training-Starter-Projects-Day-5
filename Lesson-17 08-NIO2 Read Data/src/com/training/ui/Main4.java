package com.training.ui;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class Main4 {

	public static void main(String[] args) {
		
		Path p=Paths.get("MyFiles","Personal","Favourites","actors.txt");
		
		try {
			System.out.println("Size : "+ Files.size(p));
			System.out.println("Is Directory : "+ Files.isDirectory(p));
			System.out.println("Is Regular File : "+ Files.isRegularFile(p));
			System.out.println("Is Symbolic Link : "+ Files.isSymbolicLink(p));
			System.out.println("Is Hidden File : "+ Files.isHidden(p));
			System.out.println("Last Modified Time : "+ Files.getLastModifiedTime(p));
			
			
			BasicFileAttributeView view=Files.getFileAttributeView(p, BasicFileAttributeView.class);
			BasicFileAttributes attributes=view.readAttributes();
			
			System.out.println("Creation Time : "+ attributes.creationTime());
			System.out.println("Last Access Time : "+ attributes.lastAccessTime());

			System.out.println("Size of the File : "+ attributes.size());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

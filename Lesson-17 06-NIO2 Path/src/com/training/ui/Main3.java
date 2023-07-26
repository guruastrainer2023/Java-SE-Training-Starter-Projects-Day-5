package com.training.ui;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {

	public static void main(String[] args) {
		
		Path p=Paths.get(args[0]);
		
		System.out.println("getFileName : " + p.getFileName());
		System.out.println("getParent : "+ p.getParent());
		System.out.println("getNameCount : "+p.getNameCount());
		System.out.println("getRoot : "+ p.getRoot());
		System.out.println("isAbsolute : "+ p.isAbsolute());
		System.out.println("toAbsolutePath : "+p.toAbsolutePath());
		System.out.println("toURI : "+ p.toUri());
		

	}

}

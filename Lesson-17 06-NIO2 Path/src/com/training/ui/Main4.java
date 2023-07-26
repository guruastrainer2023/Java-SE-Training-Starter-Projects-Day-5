package com.training.ui;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main4 {

	public static void main(String[] args) {
		
		//normalize Example
		
		String txt1="MyFiles/Academic/../Personal/Favorites";
		Path p1=Paths.get(txt1);
		Path p2=p1.normalize();
		System.out.println(p2);
		
		String txt2="MyFiles/./Academic/Official/experience.txt";
		Path p3=Paths.get(txt2);
		Path p4=p3.normalize();
		System.out.println(p4);

	}

}

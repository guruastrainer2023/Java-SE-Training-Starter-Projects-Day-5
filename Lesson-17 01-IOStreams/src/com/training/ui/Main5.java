package com.training.ui;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main5 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile accessFile=new RandomAccessFile("marks.dat", "rw");
		
		int i=accessFile.readInt();
		int j=accessFile.readInt();
		int k=accessFile.readInt();
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		
		
		accessFile.close();

	}

}

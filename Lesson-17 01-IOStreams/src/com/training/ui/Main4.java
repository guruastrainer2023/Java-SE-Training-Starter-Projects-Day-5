package com.training.ui;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main4 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile accessFile=new RandomAccessFile("marks.dat", "rw");
		
		int[]arr= {80, 90, 100};
		
		accessFile.writeInt(arr[0]);
		accessFile.writeInt(arr[1]);
		accessFile.writeInt(arr[2]);
		
		accessFile.close();

	}

}

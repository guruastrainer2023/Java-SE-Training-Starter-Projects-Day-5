package com.training.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Main1 {

	public static void main(String[] args)  {
		try(
			FileChannel fcIn=new FileInputStream("intro.txt").getChannel();	
			FileChannel fcOut=new FileOutputStream("intro1.txt").getChannel();
				
		){
			ByteBuffer buffer=ByteBuffer.allocate((int) fcIn.size());
			fcIn.read(buffer);
			buffer.position(0);
			fcOut.write(buffer);
			
			System.out.println("File Content Copied to Another File through Channel");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}

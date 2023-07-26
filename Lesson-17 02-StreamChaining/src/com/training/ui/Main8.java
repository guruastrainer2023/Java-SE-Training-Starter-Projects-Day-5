package com.training.ui;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main8 {

	public static void main(String[] args) throws IOException {
		float a=80.0F;
		double b=90.0;
		int c=100;
		
		OutputStream os=new FileOutputStream("data.dat");
		DataOutputStream dos=new DataOutputStream(os);
		
		dos.writeInt(c);
		dos.writeDouble(b);
		dos.writeFloat(a);
		
		dos.flush();
		os.flush();
		
		dos.close();
		os.close();
		
	}
}

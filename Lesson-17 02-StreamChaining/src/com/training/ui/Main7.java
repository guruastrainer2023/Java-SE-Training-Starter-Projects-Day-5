package com.training.ui;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main7 {

	public static void main(String[] args) throws IOException {
		OutputStream os=new FileOutputStream("info2.txt");
		Writer writer=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(writer);
		
		
		
		bw.write("hello world");
		
		bw.flush();
		writer.flush();
		os.flush();
		
		writer.close();
		os.close();

	}

}

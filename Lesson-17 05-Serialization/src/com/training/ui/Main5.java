package com.training.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import com.training.bean.Circle;
import com.training.bean.CollectionFactory;

public class Main5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<Circle>cirles =CollectionFactory.getCircleList();
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("circles.dat"));
		oos.writeObject(cirles);
		
		oos.flush();
		oos.close();
		

	}

}

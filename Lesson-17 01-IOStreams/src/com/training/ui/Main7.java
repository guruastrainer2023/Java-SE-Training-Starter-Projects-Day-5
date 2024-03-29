package com.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.List;

import com.training.bean.Customer;

public class Main7 {

	public static void main(String[] args) throws IOException  {
		RandomAccessFile accessFile=new RandomAccessFile("customers.dat", "rw");
		
		List<Customer> customers=new LinkedList<>();
		while(true) {
			try {
				String name=accessFile.readUTF();
				double balance=accessFile.readDouble();
				String city=accessFile.readUTF();
				Customer customer=new Customer(name, balance, city);
				customers.add(customer);
			}catch(Exception e) {
				System.out.println(e.getMessage());
				System.out.println(customers);
				return;
			}
			
		}
		
	}

}

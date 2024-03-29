package com.training.ui;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.List;

import com.training.bean.CollectionFactory;
import com.training.bean.Customer;

public class Main6 {

	public static void main(String[] args) throws IOException {
		List<Customer> customers=CollectionFactory.getCustomerList();
		
		RandomAccessFile accessFile=new RandomAccessFile("customers.dat", "rw");
		
		for(Customer customer: customers) {
			accessFile.writeUTF(customer.getName());
			accessFile.writeDouble(customer.getBalanceAmount());
			accessFile.writeUTF(customer.getCity());
		}

		accessFile.close();
	}

}

package com.training.ui;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main1 {

	public static void main(String[] args) {
		
		List<Integer> iList=new ArrayList<>();
		for(int i=0; i<=5_00_0000; i++)
			iList.add(i);
		
		long sum=0;
		for(Integer i:iList) {
			sum+=i;
			System.out.println(i);
		}
		
		System.out.println(sum);
	}

}

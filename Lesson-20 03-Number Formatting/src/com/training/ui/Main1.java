package com.training.ui;

import java.text.NumberFormat;
import java.util.Locale;

public class Main1 {

	private static void printNumberFrance() {
		Locale locale = Locale.FRANCE;

		double salary = 5_60_6000.00d;

		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

		String currencyStr = nf.format(salary);

		System.out.println(currencyStr);

	}
	
	private static void printNumberChinese() {
		Locale locale = Locale.SIMPLIFIED_CHINESE;

		double salary = 5_60_6000.00d;

		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

		String currencyStr = nf.format(salary);

		System.out.println(currencyStr);

	}
	
	private static void printNumberUS() {
		Locale locale = Locale.US;

		double salary = 5_60_6000.00d;

		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

		String currencyStr = nf.format(salary);

		System.out.println(currencyStr);

	}
	
	private static void printNumberItaly() {
		Locale locale = Locale.ITALY;

		double salary = 5_60_6000.00d;

		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);

		String currencyStr = nf.format(salary);

		System.out.println(currencyStr);

	}

	public static void main(String[] args) {

		printNumberUS();
	}

}

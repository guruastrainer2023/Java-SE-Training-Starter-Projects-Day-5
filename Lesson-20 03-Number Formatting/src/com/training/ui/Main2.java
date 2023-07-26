package com.training.ui;

import java.text.NumberFormat;
import java.util.Locale;

public class Main2 {
	
	private static void printPercentItaly() {
		Locale locale=Locale.ITALY;
		double per = 0.05;

		NumberFormat nf = NumberFormat.getPercentInstance(locale);

		String resultStr = nf.format(per);

		System.out.println(resultStr);
	}
	
	private static void printPercentChinese() {
		Locale locale=Locale.SIMPLIFIED_CHINESE;
		double per = 0.05;

		NumberFormat nf = NumberFormat.getPercentInstance(locale);

		String currencyStr = nf.format(per);

		System.out.println(currencyStr);
	}

	public static void main(String[] args) {
		printPercentChinese();

	}

}

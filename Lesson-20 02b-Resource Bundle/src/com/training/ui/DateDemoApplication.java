package com.training.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.ResourceBundle;

public class DateDemoApplication {

	
		PrintWriter pw=new PrintWriter(System.out, true);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Locale ruLocale=new Locale("ru", "RU");
		Locale currLocale=Locale.US;
		
		ResourceBundle messages= ResourceBundle.getBundle("MessageBundle", Locale.US);
		
		LocalDateTime today=LocalDateTime.now();
		DateTimeFormatter df;
		
		
		public static void main(String[] args) {
			
			DateDemoApplication dda=new DateDemoApplication();
			dda.run();
		}
		
	
	
	public void run() {
		String line="";
		while(!(line.equals("q"))) {
			this.printMenu();
			try {
				line=this.br.readLine();
			}catch(IOException e) {
				System.out.println("Error : " + e.getMessage());
			}
			switch(line) {
			case "1":this.setEnglish();break;
			case "2":this.setFrench();;break;
			case "3":this.setChinese();;break;
			case "6":this.setRussian();;break;
			
			
			}
		}
	}
	
	public void setEnglish() {
		this.currLocale=Locale.US;
		this.messages=ResourceBundle.getBundle("MessageBundle", this.currLocale);
		
	}
	
	public void setFrench() {
		this.currLocale=Locale.FRANCE;
		this.messages=ResourceBundle.getBundle("MessageBundle", this.currLocale);
	}
	
	public void setChinese() {
		this.currLocale=Locale.SIMPLIFIED_CHINESE;
		this.messages=ResourceBundle.getBundle("MessageBundle", this.currLocale);
	}
	
	public void setRussian() {
		this.currLocale=this.ruLocale;
		this.messages=ResourceBundle.getBundle("MessageBundle", this.currLocale);
	}
	
	public void printMenu() {
		pw.println("===== Date App ================= ");
		
		df=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(currLocale);
		pw.println(messages.getString("date1")+ " "+ today.format(df));
		
		df=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(currLocale);
		pw.println(messages.getString("date2")+ " "+ today.format(df));
		
		df=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(currLocale);
		pw.println(messages.getString("date3")+ " "+ today.format(df));
		
		df=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(currLocale);
		pw.println(messages.getString("date4")+ " "+ today.format(df));
		
		df=DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(currLocale);
		pw.println(messages.getString("date5")+ " "+ today.format(df));
		
		pw.println("------------------------ Choose Language Option ");
		
		pw.println("1. "+  messages.getString("menu1"));
		pw.println("2. "+  messages.getString("menu2"));
		pw.println("3. "+  messages.getString("menu3"));
		pw.println("4. "+  messages.getString("menu4"));
		pw.println("5. "+  messages.getString("menu5"));
		pw.println("6. "+  messages.getString("menu6"));
		
		System.out.println(messages.getString("menucommand"));
		
		
		
		
	}

}

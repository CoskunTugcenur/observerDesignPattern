package com.example.observerpattern;

public class App {
  public static void main(String[] args) {
	  
	DollarExchange dollarExchange=new DollarExchange(8.42);
	Customer tugce= new Customer("aa","bb");
	Customer nur= new Customer("aa1","bb1");
	Customer coskun= new Customer("aa2","bb2");
	
	dollarExchange.addObserver(tugce);
	dollarExchange.addObserver(nur);
	dollarExchange.addObserver(coskun);
	
	for (int i=0;i<5;i++) {
		dollarExchange.setDollarRate((i*0.01)+8.41);
	}
  
  }
}

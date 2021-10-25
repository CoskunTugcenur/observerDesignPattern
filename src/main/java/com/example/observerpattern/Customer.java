package com.example.observerpattern;

public class Customer implements Observer{

	
	public String name;
	public String surname;
	
	public Customer( String name,String surname) {
		this.name=name;
		this.surname=surname;
	}
	
	@Override
	public void updateInc(Observable observable) {
		
		DollarExchange _observable =(DollarExchange) observable;
		
		System.out.println(this.name+" "+this.surname+" dollar rate is above the set limit" + _observable.getDollarRate());
	}

	@Override
	public void updateDec(Observable observable) {
		DollarExchange _observable =(DollarExchange) observable;

		System.out.println(this.name+" "+this.surname+" dollar rate below the set limit"+ _observable.getDollarRate());		
	}

}

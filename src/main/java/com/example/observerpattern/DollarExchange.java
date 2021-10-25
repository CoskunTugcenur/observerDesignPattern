package com.example.observerpattern;

public class DollarExchange extends Observable {

	private double dollarLimit;
	
	private double dollarRate;
	
	public DollarExchange(double dollarLimit) {
		this.dollarLimit=dollarLimit;
	}
	
	
	public void setDollarRate(double dollarRate) {
		this.dollarRate = dollarRate;
		controlDollarRate(this.dollarRate);	
	}
	
	public double getDollarRate() {
		return this.dollarRate ;
	}
	
	public void controlDollarRate(double dollarRate) {
		if(dollarRate> dollarLimit) {
			reportDollarIncrease();
		}
		
		if(dollarRate<dollarLimit) {
			reportDollarDecrease();
		}
	}
	
	

	

	
	
}

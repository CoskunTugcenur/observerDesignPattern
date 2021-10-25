package com.example.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	public List<Observer> observerList;
	
	public Observable(){
		observerList =new ArrayList<Observer>();
	}
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		observerList.remove(observer);	
	}
	

	public void reportDollarIncrease() {
		for (Observer observer : observerList) {
			observer.updateInc(this);
		}
	}
	
	public void reportDollarDecrease() {
		for (Observer observer : observerList) {
			observer.updateDec(this);
		}
	}
	
	
	
}

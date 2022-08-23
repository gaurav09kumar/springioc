package com.example.ioc;

public class Airtel implements Sim{
	
	Airtel(){
		System.out.println("Airtel Constructor called");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Airtel sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing internet using airtel sim");
	}

}

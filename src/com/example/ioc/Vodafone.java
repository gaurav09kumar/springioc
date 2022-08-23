package com.example.ioc;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling using Vodafone sim");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("Browsing internet using Vodafone sim");
	}

}

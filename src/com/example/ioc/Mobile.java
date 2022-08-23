package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		//		Airtel airtel = (Airtel)context.getBean("airtel");
		//		airtel.calling();
		//		airtel.data();
		//		
		//		Vodafone voda = context.getBean("vodafone",Vodafone.class);
		//		voda.calling();
		//		voda.data();

		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();


	}
}

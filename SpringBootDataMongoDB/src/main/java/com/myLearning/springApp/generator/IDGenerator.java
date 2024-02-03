package com.myLearning.springApp.generator;

import java.util.UUID;

public class IDGenerator {
	
	public static String generateID() {
		
		System.out.println("Custom ID Generator is called");
		return UUID.randomUUID().toString();
		
	}
	

}

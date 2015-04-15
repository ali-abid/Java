package com.creational.singleton;

public class Tower {

	private static Tower instance = new Tower();
	private Tower(){
	}
	
	public static Tower getInstance(){
		return instance;
	}
}

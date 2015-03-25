package com.adapter;

public class Adapter implements Engineer{

	//Create NewMachine class object (this is adaptee class)
	public NewMachine newmachine;
	
	public Adapter(){
		//instance object of adaptee class
		newmachine = new NewMachine();
	}
	@Override
	public void operateDevice() {
		//call method from adaptee class
		newmachine.newMachine();
	}

	
}

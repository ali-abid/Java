package com.adapter;

public class Manager implements Engineer{

	public Engineer engineer;
	
	public Manager(){
		//engineer object call Adapter class constructor
		engineer = new Adapter();
	}
	//This method is implemented from Engineer Interface.
	@Override
	public void operateDevice() {
		//Manager is used to running old machine.
		System.out.println("Old Machine is running!");
		//Now Manager run newmachine method using Adapter class.
		engineer.operateDevice();
	}

}

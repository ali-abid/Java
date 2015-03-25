package com.adapter;

public class Manager implements Engineer{

	public Engineer engineer;
	
	public Manager(){
		engineer = new Adapter();
	}
	//This method is implemented from Engineer Interface.
	@Override
	public void operateDevice() {
		// TODO Auto-generated method stub
		//Manager is used to running old machine.
		System.out.println("Old Machine is running!");
		//engineer.operateDevice();
		
	}

}

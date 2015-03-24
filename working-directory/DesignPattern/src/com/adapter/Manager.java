package com.adapter;

public class Manager implements Engineer{

	public Engineer engineer;
	
	public Manager(){
		engineer = new Adapter();
	}
	
	@Override
	public void operateDevice() {
		// TODO Auto-generated method stub
		engineer.operateDevice();
		
	}

}

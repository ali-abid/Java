package com.adapter;

public class Adapter implements Engineer{
	public GoblinGlider newdevice;
	public Adapter(){
		newdevice = new GoblinGlider();
	}
	@Override
	public void operateDevice() {
		// TODO Auto-generated method stub
		newdevice.start();
	}

	
}

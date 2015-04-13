package com.pattern.adapter;

public class Manager implements IEngineer{
	
	IEngineer engineer;
	
	public Manager(){
		engineer = new ElectronicEngineer();
	}

	@Override
	public void department(){
		engineer.department();
	}
}

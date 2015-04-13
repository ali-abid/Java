package com.pattern.adapter;

public class ElectronicEngineer implements IEngineer {
	
	CNCmachine cncMachine;
	public ElectronicEngineer(){
		cncMachine = new CNCmachine();
	}

	@Override
	public void department(){
		System.out.println("Electronics Department");
		cncMachine.Start();
		cncMachine.Stop();
	}
}

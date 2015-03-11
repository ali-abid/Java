package com.java.ali;

/**
 * 
 * GnomeEngineering manager uses Engineer to operate devices.
 * 
 */
public class GnomeEngineeringManager implements Engineer {

	private Engineer engineer;

	public GnomeEngineeringManager() {
		// Creating object of GnoneEngineer from Engineer Interface
		engineer = new GnomeEngineer();
	}

	@Override
	public void operateDevice() {
		//Calling GnomeEngineer method
		engineer.operateDevice();
	}
}

package com.java.ali;

/**
 * 
 * Adapter class. Adapts the interface of the device (GoblinGlider) into
 * Engineer interface expected by the client (GnomeEngineeringManager).
 * 
 */
// This is adapter class
public class GnomeEngineer implements Engineer {

	private GoblinGlider glider;

	public GnomeEngineer() {
		// Create glider object for GnomeGlider.java class
		glider = new GoblinGlider();
	}

	@Override
	public void operateDevice() {
		glider.attachGlider();
		glider.gainSpeed();
		glider.takeOff();
	}

}

package com.java.ali;

/**
 * 
 * Device class (adaptee in the pattern).
 * 
 */
//This is client class which is ack like adaptee
public class GoblinGlider {

	// Following methods need to attach with Adapter class(GnomeEngineer) and run by Manager (GnomeEngineeringManager.java)
	public void attachGlider() {
		System.out.println("Glider attached.");
	}

	public void gainSpeed() {
		System.out.println("Gaining speed.");
	}

	public void takeOff() {
		System.out.println("Lift-off!");
	}
}

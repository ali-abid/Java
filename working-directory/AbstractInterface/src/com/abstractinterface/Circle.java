package com.abstractinterface;

public class Circle extends Figure {
	
	private float radius;
	
	public float getArea(){
		return (float) (3.14 * (radius *2));
	}
}

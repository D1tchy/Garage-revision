package com.qa.garage;

public abstract class Vehicle {

//	variables
	private String colour;
	private int wheels;

//	constructor
	public Vehicle() {
		super();
	}

	public Vehicle(String colour, int wheels) {
		super();
		this.colour = colour;
		this.wheels = wheels;

	}
// getters
	public String getColour() {
		return colour;
	}

	public int getWheels() {
		return wheels;
	}
//setters
	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public String toString() {
		return "Vehicle [colour=" + colour + ", wheels=" + wheels + "]";
	}

}

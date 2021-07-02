package com.qa.garage;

public class Car extends Vehicle {

//	constructor variable, 
	private boolean windscreen;

	public Car() {
		super();
	}

	public Car(boolean windscreen, String colour, int wheels) {
		super(colour, wheels);
		this.windscreen = windscreen;
	}

// as the getter is a boolean it returns a true or false - "is" 
	public boolean isWindscreen() {
		return windscreen;
	}

	public void setWindscreen(boolean windscreen) {
		this.windscreen = windscreen;
	}

	@Override
	public String toString() {
		return "Car [windscreen=" + windscreen + "," + super.toString() + "]";
	}

}

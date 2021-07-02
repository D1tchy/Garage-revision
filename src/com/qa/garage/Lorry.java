package com.qa.garage;

public class Lorry extends Vehicle {

	private boolean cab;

	public Lorry() {
		super();

	}

	public Lorry(boolean cab, String colour, int wheels) {
		super(colour, wheels);
		this.cab = cab;
	}

	public boolean isCab() {
		return cab;
	}

	public void setCab(boolean cab) {
		this.cab = cab;
	}

	@Override
	public String toString() {
		return "Lorry [cab=" + cab + "," + super.toString() +"]";
	}

}

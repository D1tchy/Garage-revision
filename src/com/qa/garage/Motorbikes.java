package com.qa.garage;

public class Motorbikes extends Vehicle  {

	private boolean handlebars;

	public Motorbikes() {
		super();
		// TODO Auto-generated constructor stub
	}

//	arguments - colour, wheels, handlebars - needed to construct the motorbike
	public Motorbikes(boolean handlebars, String colour, int wheels) {
		super(colour, wheels); 
		this.handlebars = handlebars;
		
	}

	public boolean isHandlebars() {
		return handlebars;
	}

	public void setHandlebars(boolean handlebars) {
		this.handlebars = handlebars;
	}

	@Override
	public String toString() {
		return "Motorbikes [handlebars=" + handlebars + "," + super.toString() + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

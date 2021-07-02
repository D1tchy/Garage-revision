package com.qa.garage;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car(true, "purple", 4 );
		
		Motorbikes bike1 = new Motorbikes(true, "yellow", 2);
		
		Lorry lor1 = new Lorry (true, "blue", 18);
		
		
		Garage garage1 = new Garage () ;
		
		garage1.addVehicle(car1);
		garage1.addVehicle(bike1);
		garage1.addVehicle(lor1);
		garage1.removeByType("Motorbikes");
		garage1.print();
		
		garage1.vehicleLoop();
		
		garage1.fixById(1);
		garage1.emptyGarage();
		garage1.print();
	}

}

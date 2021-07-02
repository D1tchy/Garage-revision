package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public void vehicleLoop() {

		int bill = 0;

		for (Vehicle count : this.vehicles) {
			if (count.getClass().getSimpleName().equals("Car")) {
				bill += 200;
			} else if (count.getClass().getSimpleName().equals("Motorbikes")) {
				bill += 100;
			} else if (count.getClass().getSimpleName().equals("Lorry")) {
				bill += 1000;
			}
		}
		System.out.println("bill: £" + bill);
	}

//	public void addVehicle(Vehicle type, List<Vehicle> vehicles) {
//		vehicles.add(type);
//		
//	}
	public void addVehicle(Vehicle a) {
		this.vehicles.add(a);
	}

	public void removeVehicle(Vehicle b) {
		this.vehicles.remove(b);

	}

	public void emptyGarage() {

		this.vehicles.clear();
		System.out.println("garage is empty");
	}

	public void removeById(int id) {

		this.vehicles.remove(id);
	}

	public void removeByType(String type) {

		for (Vehicle count : this.vehicles) {

			if (count.getClass().getSimpleName().equals(type)) {

				this.vehicles.remove(count);
			}
		}
	}

	public void fixById(int id) {

//		vehicles[id]
		int bill = 0;

		if (this.vehicles.get(id).getClass().getSimpleName().equals("Car")) {
			bill += 200;
		} else if (this.vehicles.get(id).getClass().getSimpleName().equals("Motorbikes")) {
			bill += 100;
		} else if (this.vehicles.get(id).getClass().getSimpleName().equals("Lorry")) {
			bill += 1000;
		}

		System.out.println("fix by id bill: £" + bill);
	}
	public void print () {
		
		System.out.println(this.vehicles);
	}
}

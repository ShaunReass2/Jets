package com.skilldistillery.jets.entity;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane(String model, int speed, int range, int price) {
		super(model, speed, range, price);
	
	}

	@Override
	public void loadCargo() {
		// define what loadCargo does
		
	}

}

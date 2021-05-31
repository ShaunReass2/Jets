package com.skilldistillery.jets.entity;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() { }
	
	public CargoPlane(String model, int speed, int range, int price) {
		super(model, speed, range, price);
	
	}

	@Override
	public void loadCargo() {
		
		System.out.print("Load 'em up and make sure you are load master approved! After the pilots get a minimum eight hours of rest, we will be ready for takeoff!"); 
		System.out.println(" ");
		
	}
	
}

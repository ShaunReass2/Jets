package com.skilldistillery.jets.entity;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() { }
	
	public FighterJet(String model, int speed, int range, int price) {
		super(model, speed, range, price);

	}

	@Override
	public void fight() {
	System.out.println("You're writing checks your body can't cash!");
	
	}
	
}

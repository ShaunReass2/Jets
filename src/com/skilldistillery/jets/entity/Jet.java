package com.skilldistillery.jets.entity;

public abstract class Jet {

	private String model;
	private int speed;
	private int range;
	private int price;
	
	public Jet() { }
	
	public Jet(String model, int speed, int range, int price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	
	public void fly() {
	//needs to print outs the jet details and the amount of time the jet can fly until it runs out of fuel
		System.out.println("Jet Model: " + model + ", Speed: " + speed + " mph " + ", Range: " + range + " miles " + ", Price: " + "$" + price + 
				", Total Flight Time: " + (range / (speed / 60)) + " minutes"); 
	
	}

	@Override
	public String toString() {
		return "Jet Model: " + model + ", Speed: " + speed + " mph " + ", Range: " + range + " miles " + ", Price: " + "$" + price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

}

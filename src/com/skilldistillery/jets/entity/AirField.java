package com.skilldistillery.jets.entity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class AirField {

	private List<Jet> jets = new ArrayList<>();

	public AirField() {

	}
	
	public void addJet(Jet jet) {
		this.jets.add(jet); 
	}

	public void initialize() {

		BufferedReader bufIn = null;

		try {
			bufIn = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] jetData = line.split(", ");
//			  System.out.print(jetData[0]);              // model
				String model = jetData[0];
//			  System.out.print(jetData[1]);              // speed
				int speed = Integer.parseInt(jetData[1]);
//			  System.out.print(jetData[2]);              // range
				int range = Integer.parseInt(jetData[2]);
//			  System.out.println(jetData[3]);            // price
				int price = Integer.parseInt(jetData[3]);
				String aircraftType = jetData[4];
				Jet newJet;
				if (aircraftType.equals("fighter")) {
					newJet = new FighterJet(model, speed, range, price);
				} else if (aircraftType.equals("cargo")) {
					newJet = new CargoPlane(model, speed, range, price);
				} else {
					newJet = new JetImpl(model, speed, range, price);
				}
				jets.add(newJet);

			}

		} catch (IOException e) {
			System.err.println(e);
		}

	}

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}

}

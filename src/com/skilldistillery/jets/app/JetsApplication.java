package com.skilldistillery.jets.app;

import java.util.Scanner;

import com.skilldistillery.jets.entity.AirField;


public class JetsApplication {
	
	private AirField airField; 
	
	
	public static void main(String[] args) {
		
		JetsApplication ja = new JetsApplication(); 
		ja.run(); 

	}
	
	public void run() {
		
		airField = new AirField(); 
		
	}
	
	public void userInput() {
		
	}
	
	public void menuOptions() {
		Scanner scanner = new Scanner(System.in);
		boolean menu = true;

		while (menu) {
			
			System.out.println("***************************************");
			System.out.println("                                       ");
			System.out.println("                 MENU                  ");
			System.out.println("          (choose a number)            ");
			System.out.println("                                       ");
			System.out.println("    1. List Fleet                      ");
			System.out.println("    2. Fly All Jets                    ");
			System.out.println("    3. View Fastest Jet                ");
			System.out.println("    4. View Jet with Longest Range     ");
			System.out.println("    5. Load All Cargo Jets             ");
			System.out.println("    6. Dogfight!!                      ");
			System.out.println("    7. Add a Jet to the Fleet          ");
			System.out.println("    8. Remove a Jet from the Fleet     ");
			System.out.println("    9. Quit                            ");
			System.out.println("                                       ");
			System.out.println("***************************************");
			
			int menuChoice = scanner.nextInt();

			switch (menuChoice) {
			case 1:
				listFleet();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				viewFastestJet();
				break;
			case 4: 
				longestRange(); 
				break;
			case 5:
				loadCargo(); 
				break; 
			case 6: 
				dogFight(); 
				break; 
			case 7: 
				addJet(); 
				break; 
			case 8: 
				removeJet(); 
				break; 
			case 9:
				quitApp();
				menu = false;
				break;

			default:
				System.out.println("That is not a valid selection. Please choose a numeral from 1 through 9.");
			}
		}
	}
	
	public void listFleet() {
		// prints model, speed, range, and price of each jet. There must be five. 
	}
	
	public void flyAllJets() {
		// prints out the jet details and the amount of time the jet can fly until it runs out of fuel, based on speed and range.
	}
	
	public void viewFastestJet() {
		// must search the collection of jets to find the aircraft with the fastest speed. 
	}
	
	public void longestRange() {
		// must search the collection of jets to find the aircraft with the longest range. 
	}
	
	public void loadCargo() {
		
	}
	
	public void dogFight() {
		
	}
	
	public void addJet() {
		
	}
	
	public void removeJet() {
		
	}
	
	public void quitApp() {
		
	}

}

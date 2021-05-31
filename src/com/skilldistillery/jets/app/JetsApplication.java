package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entity.AirField;
import com.skilldistillery.jets.entity.CargoPlane;
import com.skilldistillery.jets.entity.FighterJet;
import com.skilldistillery.jets.entity.Jet;
import com.skilldistillery.jets.entity.JetImpl;

public class JetsApplication {
	
	public static void main(String[] args) {
	
		JetsApplication ja = new JetsApplication(); 
		
		AirField airField = new AirField(); 
		
		airField.initialize(); 		
		
		List<Jet> listOfJets = airField.getJets(); 
		
		ja.menu(); 
		ja.menuOptions(listOfJets); 
//		ja.run(); 
//		
//	}
//	
//	public void run() {
//		
	}
	
	public void menu() {
		
		System.out.println(" ");
		System.out.println("Please choose a number from the menu below.");
		
		System.out.println("*******************************************");
		System.out.println("                                           ");
		System.out.println("                     MENU                  ");
		System.out.println("              (choose a number)            ");
		System.out.println("                                           ");
		System.out.println("        1. List Fleet                      ");
		System.out.println("        2. Fly All Jets                    ");
		System.out.println("        3. View Fastest Jet                ");
		System.out.println("        4. View Jet with Longest Range     ");
		System.out.println("        5. Load All Cargo Jets             ");
		System.out.println("        6. Dogfight!!                      ");
		System.out.println("        7. Add a Jet to the Fleet          ");
		System.out.println("        8. Remove a Jet from the Fleet     ");
		System.out.println("        9. Quit                            ");
		System.out.println("                                           ");
		System.out.println("*******************************************");
	
	}
	
	public void menuOptions(List<Jet> listOfJets) {
		Scanner scanner = new Scanner(System.in);
		int userMenuSelection = 0; 
		
		while (userMenuSelection != 9) {
			userMenuSelection = scanner.nextInt(); 
		
		if(userMenuSelection == 1) {
			listFleet(listOfJets); 
			
		} else if (userMenuSelection == 2) {
			flyAllJets(listOfJets); 
			
		} else if (userMenuSelection == 3) {
			viewFastestJet(listOfJets);
			
		} else if (userMenuSelection == 4) {
			longestRange(listOfJets); 
			
		} else if (userMenuSelection == 5) {
			presentAllCargoInfo(listOfJets); 
			
		} else if (userMenuSelection == 6) {
			dogFight(listOfJets); 
			
		} else if (userMenuSelection == 7) {
			addJet(); 
			
		} else if (userMenuSelection == 8) {
			removeJet(); 
			
		} else if (userMenuSelection == 9) {
			quitApp(); 

		}else {
			System.out.println(" That was not a valid selection. Please choose a number from 1 to 9, as listed in the menu.");
			System.out.println(" ");
		}
		menu(); 
	}
	
}
	
	public void listFleet(List<Jet> listOfJets) {
		// prints model, speed, range, and price of each jet. There must be five. 
		System.out.println("-------------------------------------------------------------------------");
		for (Jet jet : listOfJets) {
			System.out.println(jet);	
		} 
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public void flyAllJets(List<Jet> listOfJets) {
		// prints out the jet details and the amount of time the jet can fly until it runs out of fuel, based on speed and range.
		System.out.println("---------------------------------------------------------------------------------------------------");	
		for (Jet jet : listOfJets) {
			jet.fly(); 	
		}
		System.out.println("---------------------------------------------------------------------------------------------------");

	}
	
	public void viewFastestJet(List<Jet> listOfJets) {
		// must search the collection of jets to find the aircraft with the fastest speed. 
		Jet highestSpeed = new JetImpl();  // declaring variable highestSpeed of type Jet
		for (Jet jet : listOfJets) {
			 	if(jet.getSpeed() > highestSpeed.getSpeed()) {
			 		highestSpeed = jet; 
			 	}
			 	
		}
		System.out.println("The fastest jet: " + highestSpeed.toString());
	}
	
	
	public void longestRange(List<Jet> listOfJets) {
		// must search the collection of jets to find the aircraft with the longest range. 
		Jet longRange = new JetImpl();  // declaring variable highestSpeed of type Jet
		for (Jet jet : listOfJets) {
			 	if(jet.getRange() > longRange.getRange()) {
			 		longRange = jet; 
			 	}
			 	
		}
		System.out.println("The jet with the longest range: " + longRange.toString());
	}
	
	
	public void presentAllCargoInfo(List<Jet> listOfJets) {
		// finds all implementors of the CargoCarrier interface and calls this method on each
		for (Jet jet : listOfJets) {
			 	if (jet instanceof CargoPlane) {
		 		((CargoPlane) jet).loadCargo(); 
			 	}
		}
	}
	
	public void dogFight(List<Jet> listOfJets) {
		for (Jet jet : listOfJets) {
		 		if (jet instanceof FighterJet) {
		 		((FighterJet) jet).fight(); 
		 		}
		}
	}
	
	public void addJet() {
		Scanner scanner = new Scanner(System.in);
		Jet addNewJet = new Jet(); 
		
		System.out.println("You have selected to add a jet. ");
		System.out.println("Please enter the jet model you wish to enter: ");
		List
		
		System.out.println("Please enter the jet's speed in MPH: ");
		
		
		System.out.println("Please enter the jet's range in miles: ");
		
		
		System.out.println("Please enter the jet's cost in $USD: ");
		
		
		System.out.println("Please enter the jet's role (example: fighter, cargo, etc): ");
		
		
	}
	
	public void removeJet() {
		// present the user with a sub menu to select and remove a jet y number
	}
	
	public void quitApp() {
		System.out.println("Thank you for flying with us! Goodbye!");
		System.exit(0);
	}

}



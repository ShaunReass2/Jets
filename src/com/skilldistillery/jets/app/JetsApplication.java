package com.skilldistillery.jets.app;

import java.util.List;
import java.util.Scanner;
import com.skilldistillery.jets.entity.AirField;
import com.skilldistillery.jets.entity.CargoPlane;
import com.skilldistillery.jets.entity.FighterJet;
import com.skilldistillery.jets.entity.Jet;
import com.skilldistillery.jets.entity.JetImpl;

public class JetsApplication {
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		JetsApplication ja = new JetsApplication();

		AirField airField = new AirField();

		airField.initialize();

		List<Jet> listOfJets = airField.getJets();

		ja.menuOptions(listOfJets, airField);
	}

	public void menuOptions(List<Jet> listOfJets, AirField airField) {

		boolean runMenu = true;

		while (runMenu) {
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

			int userMenuSelection = scanner.nextInt();

			if (userMenuSelection == 1) {
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
				addJet(airField);

			} else if (userMenuSelection == 8) {
				removeJet(listOfJets);

			} else if (userMenuSelection == 9) {
				quitApp();

			} else {
				System.out.println(
						" That was not a valid selection. Please choose a number from 1 to 9, as listed in the menu.");
				System.out.println(" ");
			}
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
		// prints out the jet details and the amount of time the jet can fly until it
		// runs out of fuel, based on speed and range.
		System.out.println(
				"---------------------------------------------------------------------------------------------------");
		for (Jet jet : listOfJets) {
			jet.fly();
		}
		System.out.println(
				"---------------------------------------------------------------------------------------------------");

	}

	public void viewFastestJet(List<Jet> listOfJets) {
		// must search the collection of jets to find the aircraft with the fastest
		// speed.
		Jet highestSpeed = new JetImpl(); // declaring variable highestSpeed of type Jet
		for (Jet jet : listOfJets) {
			if (jet.getSpeed() > highestSpeed.getSpeed()) {
				highestSpeed = jet;
			}

		}
		System.out.println("The fastest jet: " + highestSpeed.toString());
	}

	public void longestRange(List<Jet> listOfJets) {
		// must search the collection of jets to find the aircraft with the longest
		// range.
		Jet longRange = new JetImpl(); // declaring variable highestSpeed of type Jet
		for (Jet jet : listOfJets) {
			if (jet.getRange() > longRange.getRange()) {
				longRange = jet;
			}

		}
		System.out.println("The jet with the longest range: " + longRange.toString());
	}

	public void presentAllCargoInfo(List<Jet> listOfJets) {
		// finds all implementors of the CargoCarrier interface and calls this method on
		// each
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

	public void addJet(AirField newJet) {

		System.out.println("You have selected to add a jet. ");
		System.out.println("Please enter the jet's role (choose a number): ");
		System.out.println("1. Fighter");
		System.out.println("2. Cargo");
		System.out.println("3. Generic");
		int userRoleChoice = scanner.nextInt();
		scanner.nextLine(); 

		System.out.println("Please enter the jet model you wish to enter: ");
		String userAddedModel = scanner.nextLine();

		System.out.println("Please enter the jet's speed in MPH: ");
		int userAddedSpeed = scanner.nextInt();

		System.out.println("Please enter the jet's range in miles: ");
		int userAddedRange = scanner.nextInt();

		System.out.println("Please enter the jet's price in whole $USD: ");
		int userAddedPrice = scanner.nextInt();

		Jet userAddedJet;
		userAddedJet = new JetImpl(userAddedModel, userAddedSpeed, userAddedRange, userAddedPrice);

		if (userRoleChoice == 1) {
			Jet jetAddition = new FighterJet(userAddedModel, userAddedSpeed, userAddedRange, userAddedPrice);
			newJet.addJet(jetAddition);
		} else if (userRoleChoice == 2) {
			Jet jetAddition = new CargoPlane(userAddedModel, userAddedSpeed, userAddedRange, userAddedPrice);
			newJet.addJet(jetAddition);
		} else {
			Jet jetAddition = new JetImpl(userAddedModel, userAddedSpeed, userAddedRange, userAddedPrice);
			newJet.addJet(jetAddition);
		}

	}

	public void removeJet(List<Jet> listOfJets) {
		// present the user with a sub menu to select and remove a jet y number
		System.out.println("Select a jet to remove: ");
		
		for(int i = 0; i < listOfJets.size(); i++) {
			System.out.println((i + 1) + ". " + listOfJets.get(i).getModel()); 
		}
		int userRemoveJetSelection = scanner.nextInt(); 
		listOfJets.remove(userRemoveJetSelection - 1); 
	} 

	public void quitApp() {
		System.out.println("Thank you for flying with us! Goodbye!");
		scanner.close(); 
		System.exit(0);
	}

}

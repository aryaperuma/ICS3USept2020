package finalProject;

import java.util.*; // importing Scanner and all required elements

public class MoonTeaTester { // Constructor (Switch Tester and Constructor)
	static Scanner userInput = new Scanner(System.in); // taking user input
	public double milk, boba, water;
	public int TeaCount = 0;

	public MoonTeaTester() { // Initializing the default constructor
		this.boba = 0;
		this.milk = 0;
		this.water = 0;
	}

	public void SetIngredient() { // Setting the ingredients to fill the machine when there are no more ingredients left
		System.out.println("\nFilling...");
		this.boba = 40; // instantiating using this keyword to fill ingredients
		this.milk = 3; // instantiating using this keyword
		this.water = 4; // instantiating using this keyword
		System.out.println("Filling Completed.");
	}

	public void GetIngredient() { // getting ingredients and printing what is available
		System.out.println("Available Boba(Gram) " + String.format("%.1f", this.boba));
		System.out.println("Available Milk(Liter) " + String.format("%.1f", this.milk));
		System.out.println("Available Water(Liter) " + String.format("%.1f", this.water));
	}

	// Behavioural Methods
	public void CleanMachine() { // Initializing with values equal to 0 to clean the maachine
		System.out.println("\nCleaning Machine...");
		this.boba = 0;
		this.milk = 0;
		this.water = 0;
		System.out.println("Cleaning Completed.");
	}

	public void makeTea() { // Tea Selection Menu
		System.out.println("\n ------------------ ");
		System.out.println(
				"|   Select Type:   |\n ------------------ \n| 1:  Milk Tea \n| 2:  Fruit Iced Tea  \n| 3:  Foam Tea  \n| 4:  Oolong Tea \n| 5:  Slushy \n| 6:  Milkshake  \n| 0 to Discard"); // selection menu for user
		System.out.println(" \n\n------------------ \n");
		char t = userInput.next().charAt(0); // allowing the user to input a char
		switch (t) {
		case '1':
			this.MilkTea(); // Calling the MilkTea method
			break;
		case '2':
			this.FruitIcedTea(); // Calling the FruitIcedTea method
			break;
		case '3':
			this.FoamTea(); // Calling the FoamTea Method
			break;
		case '4':
			this.OolongTea(); // Calling the OolongTea Method
			break;
		case '5':
			this.Slushy(); // Calling the Slushy method
			break;
		case '6':
			this.Milkshake(); // Calling the Milkshake method
			break;
		case '0':
			break;
		}
	}

	public void MilkTea() { // MilkTea Method
		if (this.boba >= 10 && this.water >= 0.2) { // naming criteria for the components of MilkTea with if statement
			System.out.println("\nMaking Milk Tea...");
			System.out.println("\nTaking 3 gm of Boba.");
			this.boba = this.boba - 10; // taking required boba from total boba
			System.out.println("Taking 0.2 liter of Water."); // taking required water from total water
			this.water = this.water - 0.2; // taking required water from total water
			System.out.println("\nYour Milk Tea is Ready.");
			this.TeaCount++; // incrementing the amount of milk teas made
		} else {
			System.out.println("\nAvailable Boba (Grams) " + String.format("%.1f", this.boba)); // if above conditions are not met print available boba
			System.out.println("Available Water(Liter) " + String.format("%.1f", this.water)); // if above conditions are not met print available water
			System.out.println("\nSome Iteams Are Not Available, Please Refill ingredients before Making Milk Tea."); // telling user to refill the ingredients 
		}
	}

	public void FruitIcedTea() { // FruitIcedTea Method
		if (this.boba >= 10 && this.milk >= 0.4 && this.water >= 0.5) { // naming criteria for the components of FruitIcedTea with if statement
			System.out.println("\nMaking Iced Tea...");
			System.out.println("\nTaking 3 gm of Boba.");
			this.boba = this.boba - 10; // taking required boba from total boba
			System.out.println("Taking 0.4 Liter of Milk.");
			this.milk = this.milk - 0.4; // taking required milk from total milk
			System.out.println("Taking 0.2 liter of Water.");
			this.water = this.water - 0.2; // taking required water from total water
			System.out.println("\nYour Fruit Iced Tea.");
			this.TeaCount++; // incrementing the amount of fruit iced teas made
		} else {
			System.out.println("\nAvailable Boba(Gram) " + String.format("%.1f", this.boba)); // if above conditions are not met print available boba
			System.out.println("Available Milk(Liter) " + String.format("%.1f", this.milk)); // if above conditions are not met print available milk
			System.out.println("Available Water(Liter) " + String.format("%.1f", this.water)); // if above conditions are not met print available water
			System.out.println("\nSome Iteams Are Not Available, Please Fill before making Fruit Iced Tea.");
		}
	}

	public void FoamTea() {
		if (this.boba >= 4 && this.milk >= 0.5 && this.water >= 0.1) { // naming criteria for the components of FoamTea with if statement
			System.out.println("\nMaking Foam Tea...");
			System.out.println("\nTaking 1 gm of Boba.");
			this.boba = this.boba - 10; // taking required boba from total boba
			System.out.println("Taking 0.5 Liter of Milk.");
			this.milk = this.milk - 0.4; // taking required milk from total milk
			System.out.println("Taking 0.2 liter of Water."); // taking required water from total water
			this.water = this.water - 0.2; // taking required water from total water
			System.out.println("\nYour Foam Tea.");
			this.TeaCount++;// incrementing the amount of foam teas made
		} else {
			System.out.println("\nAvailable Boba (Gram) " + String.format("%.1f", this.boba)); // if above conditions are not met print available boba
			System.out.println("Available Milk(Liter) " + String.format("%.1f", this.milk)); // if above conditions are not met print available milk
			System.out.println("Available Water(Liter) " + String.format("%.1f", this.water)); // if above conditions are not met print available water
			System.out.println("\nSome Iteams Are Not Available, Please Fill before making Foam Tea."); // telling user to refill the ingredients 
		}
	}

	public void OolongTea() {
		if (this.boba >= 15 && this.milk >= 0.2 && this.water >= 0.6) { // naming criteria for the components of OolongTea with if statement
			System.out.println("\nMaking Oolong Tea...");
			System.out.println("\nTaking 2 gm of Boba.");
			this.boba = this.boba - 10; // taking required boba from total boba
			System.out.println("Taking 0.2 Liter of Milk.");
			this.milk = this.milk - 0.4; // taking required milk from total milk
			System.out.println("Taking 0.7 liter of Water."); // taking required water from total water
			this.water = this.water - 0.2; // taking required water from total water
			System.out.println("\nYour Oolong Tea.");
			this.TeaCount++; // incrementing the amount of oolong teas made
		} else {
			System.out.println("\nAvailable Boba (Gram) " + String.format("%.1f", this.boba)); // if above conditions are not met print available boba
			System.out.println("Available Milk(Liter) " + String.format("%.1f", this.milk)); // if above conditions are not met print available milk
			System.out.println("Available Water(Liter) " + String.format("%.1f", this.water)); // if above conditions are not met print available water
			System.out.println("\nSome Items Are Not Available, Please Fill before making Oolong Tea."); // telling user to refill the ingredients 
		}
	}

	public void Slushy() { // naming criteria for the components of Slushy with if statement
		if (this.boba >= 5 && this.milk >= 0.1 && this.water >= 0.8) {
			System.out.println("\nMaking Iced Tea...");
			System.out.println("\nTaking 0 gm of Boba.");
			this.boba = this.boba - 10; // taking required boba from total boba
			System.out.println("Taking 0.1 Liter of Milk.");
			this.milk = this.milk - 0.4; // taking required milk from total milk
			System.out.println("Taking 0.7 liter of Water."); // taking required water from total water
			this.water = this.water - 0.2; // taking required water from total water
			System.out.println("\nYour Slushy.");
			this.TeaCount++; // incrementing the amount of slushies teas made
		} else {
			System.out.println("\nAvailable Boba (Gram) " + String.format("%.1f", this.boba)); // if above conditions are not met print available boba
			System.out.println("Available Milk(Liter) " + String.format("%.1f", this.milk)); // if above conditions are not met print available milk
			System.out.println("Available Water(Liter) " + String.format("%.1f", this.water)); // if above conditions are not met print available water
			System.out.println("\nSome Items Are Not Available, Please Fill before making a Slushy."); // telling user to refill the ingredients 
		}
	}

	public void Milkshake() { // naming criteria for the components of Milkshake with if statement
		if (this.boba >= 10 && this.milk >= 0.7 && this.water >= 0.3) {
			System.out.println("\nMaking Iced Tea...");
			System.out.println("\nTaking 5 gm of Boba.");
			this.boba = this.boba - 10; // taking required boba from total boba
			System.out.println("Taking 0.9 Liter of Milk.");
			this.milk = this.milk - 0.4; // taking required milk from total milk
			System.out.println("Taking 0.2 liter of Water."); // taking required water from total water
			this.water = this.water - 0.2; // taking required water from total water
			System.out.println("\nYour Milkshake.");
			this.TeaCount++; // incrementing the amount of milkshakes made
		} else {
			System.out.println("\nAvailable Boba (Gram) " + String.format("%.1f", this.boba)); // if above conditions are not met print available boba
			System.out.println("Available Milk(Liter) " + String.format("%.1f", this.milk)); // if above conditions are not met print available milk
			System.out.println("Available Water(Liter) " + String.format("%.1f", this.water)); // if above conditions are not met print available water
			System.out.println("\nSome Iteams Are Not Available, Please Fill before making Milkshake."); // telling user to refill the ingredients 
		}
	}

	public void start() { // public Start class to start the machine and access behavioural methods
		System.out.println(" ----------------------------------------------------------------");
		System.out.println("|                   Moon Tea Machine                             |");
		System.out.println(" ----------------------------------------------------------------");
		System.out.println("\nCurrent Status: ");
		this.GetIngredient(); // getting ingredient using this keyword
		boolean t = true; // boolean to check if value entered is true
		while (t) { // while loop for user input
			System.out.println("\n -------------------------------- ");
			System.out.println(
					"|1:     Status of Ingredient     |\n -------------------------------- \n|2:      Fill Ingredient         |\n -------------------------------- \n|3:       Clean Machine          |\n -------------------------------- \n|4:        Make Tea           |\n -------------------------------- \n|5: How many Teas have we have made?|\n -------------------------------- \n|6:        Exit                  |");
			System.out.println(" -------------------------------- \n\n");
			char c = MoonTeaTester.userInput.next().charAt(0); // users can select their tea choices using a char
			switch (c) { // switch statement for user input
			case '1':
				System.out.println("------------- Status ------------");
				this.GetIngredient(); // calling get ingredient method
				System.out.println("---------------------------------");
				break;
			case '2':
				this.SetIngredient(); // calling set ingredient method
				break;
			case '3':
				this.CleanMachine(); // calling clean machine method
				break;
			case '4':
				this.makeTea(); // calling make tea method
				break;
			case '5':
				System.out.println("\nWe Have Made " + this.TeaCount + " Teas."); // telling user how many teas they have made
				break;
			case '6':
				System.out.println("\nExiting...\n"); // exiting program 
				t = false; // exiting program when t is false
				break; // breaking program
			}
		}
	}
	
}
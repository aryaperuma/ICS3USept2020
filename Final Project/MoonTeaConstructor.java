package finalProject;

import java.util.*; // importing neccassary materials

public class MoonTeaConstructor { // Acting Tester

	public static void main(String[] args) {
		// used encapsulation to reduce code in tester class
		Scanner userInput = new Scanner(System.in); // scanner

		System.out.println(
				"\nDo you want to Start the Machine? Y for yes and N for no. \nPLEASE NOTE IF YOU DO NOT TYPE YES, WE WILL SHUT THE MACHINE DOWN FOR IMPROPER USE");
		char d;
		d = userInput.next().charAt(0); // taking a char from the user
		if (d == 'Y' || d == 'y') {
			MoonTeaTester cm = new MoonTeaTester(); // Instance for Tea Machine
			cm.start(); // calling the start method
			System.out.println("Shutting Down...\n");
		} else
			System.out.println("Shutting Down...\n");

	}
}

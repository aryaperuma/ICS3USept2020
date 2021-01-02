package independentAssignments;

import java.util.Scanner;

public class BankerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**************");
		System.out.println(" Skyline Bank ");
		System.out.println("**************");

		// Creating an instance of the class BankerConstructor
		BankerConstructor bank = new BankerConstructor("User", " XXXYYZ");
		bank.showMenu(); // using object 1 to display menu

		bank.setCustomerName(" User "); // setting the customers name
		bank.setcustomerId(" XXXYYZ "); // setting the customers id
		System.out.println(bank.toString()); // returning String representation of object bank

	}

}

package independentAssignments;

import java.util.Scanner;

public class BankerConstructor {

	// Initializing variables of types int and String to use in constructor class
	double balance; // variable balance shows to balance left in bank account
	double previousTransaction; // variable previousTransaction shows the previous transaction
	String customerName;
	String customerId;

	// Overwritten toString method to return a string representation of obj1 defined
	// in constructor class
	public String toString() {
		return " Thanks" + customerName + "once again your Skyline Banking Services Id is: " + customerId;
	}

	// Overwritten constructor method with parameters customerName and customerId
	BankerConstructor(String customerName, String customerId) {
		this.customerName = customerName;
		this.customerId = customerId;
	}

	// Setter Methods for all 4 instance variables defined from lines 8-11
	double setBalance(double balance) {
		this.balance = balance;
		return balance;
	}

	double setPreviousTransaction(double previousTransaction) {
		this.previousTransaction = previousTransaction;
		return previousTransaction;
	}

	String setCustomerName(String customerName) {
		this.customerName = customerName;
		return customerName;
	}

	String setcustomerId(String customerId) {
		this.customerId = customerId;
		return customerId;
	}

	// Getter Methods for all 4 instance variables defined from lines 8-11
	public double getBalance() { // getter method for variable balance
		return balance;
	}

	void getPreviousTransaction() // getter method to get the previous transaction
	{
		if (previousTransaction > 0) // checking if any previous transactions have been made
		{
			System.out.println(" Deposited: " + previousTransaction); // if more than 0 previous transactions have been
																		// made, print the amount which have been made
		} else if (previousTransaction < 0) // checking if less than 0 previous transactions have been made
		{
			System.out.println(" Withdrawn: " + Math.abs(previousTransaction)); // if condition in line 53 occurs,
																				// convert the number of previous
																				// transactions into an absolute value
																				// number to keep it positive
		} else {
			System.out.println(" No transaction occured "); // else if none of the conditions from lines 49-56 are met,
															// execute line 59
		}
	}

	public String getCustomerName() { // getter method for variable customerName
		return customerName;
	}

	public String getCustomerId() { // getter method for variable customerId
		return customerId;
	}

	// Behavioural methods
	void BankAccount(String customerName, String customerId) { // behavioural method BankAccount with parameters
																// customerName and customerId
		this.customerName = customerName;
		this.customerId = customerId;
	}

	void deposit(double amount) // behavioural method deposit to deposit an amount of money
	{
		if (amount != 0) // checking if amount deposited is not 0
		{
			balance = balance + amount; // if conditions in line 78 are met add amount to balance
			previousTransaction = amount; // declaring variable previousTransaction with amount deposited
		}
	}

	void withdraw(double amount) // behavioural method withdraw to deposit an amount of money
	{
		if (amount != 0) // checking if amount withdrawn is not equal to 0
		{
			balance = balance - amount; // taking off withdrawn amount from balance
			previousTransaction = -amount; // subtracting the amount withdrawn from the previous transaction made
		}
	}

	// Menu to display choices
	void showMenu() {
		char option = '\0';
		Scanner userInput = new Scanner(System.in); // scanner to input users choices

		System.out.println(" Welcome " + customerName); // welcome message
		System.out.println(" Your ID is " + customerId
				+ "\nA. Check Balance\nB. Deposit\nC. Withdraw\nD. Previous Transaction\nE. Exit "); // displaying
																										// choices
		// Do-While loop to loop menu choices
		do {
			System.out.println(" Enter an option ");
			option = userInput.next().charAt(0); // taking a character input
			System.out.println("\n");

			switch (option) { // switch statement for menu choices
			case 'A':
				System.out.println(" Balance = " + balance); // displaying balance
				System.out.println("\n");
				break; // break statement

			case 'B':
				System.out.println(" Enter an amount to deposit "); // taking user input to deposit amount
				double amount = userInput.nextDouble();
				deposit(amount); // depositing amount entered by user
				System.out.println("\n");
				break; // break statement

			case 'C':
				System.out.println(" Enter an amount to withdraw: "); // taking an amount to withdraw from the user
				double amount2 = userInput.nextDouble();
				withdraw(amount2); // withdrawing amount entered by user
				System.out.println("\n");
				break; // break statement

			case 'D':
				getPreviousTransaction(); // getting previous transaction
				System.out.println("\n");
				break; // break statement

			case 'E': // ending menu
				System.out.println("******************************");
				break;

			default: // if none of the above menu choices are entered, code will prompt user to re
						// enter
				System.out.println(" Invalid Input!\nPlease enter again ");
				break;
			}

		} while (option != 'E'); // quitting the program when user enters 'E'
		System.out.println(" Thank you for banking with Skyline Services");
	}
}

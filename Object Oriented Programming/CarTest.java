package oop;
import java.util.Scanner;
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean quit = false;
String toQuit;
String brand, model;
int year = 0;
Scanner userInput = new Scanner(System.in);

System.out.println(" Welcome to Arya's car garage! Please enter your name. "); // Prompt to enter
String name = userInput.nextLine();

while(!quit)
{
	System.out.println( name + " Please enter the car brand, model, and year of car you would like to see: ");
	model = userInput.next();
	brand = userInput.next();
	year = userInput.nextInt();
	
	CarConstruct car = new CarConstruct(model, brand, year);

	userInput.nextLine();
	
	System.out.println(" Ok, " + name + " here is the data you have provided to the car garage: " + car);
	System.out.println(name + " , Press 'a' to continue ");
	toQuit = userInput.next();
	
	if(toQuit.equalsIgnoreCase("A"))
		quit = true;
}

userInput.close();
System.out.println( " Thank you " + name + " for checking out Arya's Car Garage! ");
}
}

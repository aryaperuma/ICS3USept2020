package oop;

import java.util.Scanner;
public class CarConstructor {

	static double testdrive;
	static double gasleft=50;
	static double gasexpended;
	static String color;
	static String descriptioncar;
	static String condition;
	
	
	CarConstructor(String color, String descriptioncar, String condition){
		this.color=color;
		this.descriptioncar=descriptioncar;
		this.condition=condition;
	}
	public String basicinfo() {
		return "Here is the Basic Infomation to Let You Get to Know More About Your Car:\nThe Color: "+color+"\nType of Car:"+descriptioncar+"\nThe Current Condition: "+condition;
	}
	//creating behavioral methods
	public void startup() {
		System.out.println("Vrooom..The car has been started successfully!");
	}
	public void exitcar() {
		System.out.println("Phhh...The car has now been shutted down.");
	}
	
	//adding distances to the car
	public static double testdrive() {
		Scanner userInput= new Scanner(System.in);
		boolean condition=true;
		while (condition)
		{
			try 
			{
			System.out.println("What is the expected distance that you want to drive? (in kilometres)");
				testdrive=Double.parseDouble(userInput.nextLine());//for parse, input always nextLine!
				condition=false;
			}
			catch (RuntimeException ex) 
			{
				System.out.println("Invalid Input!");
			}
			if (testdrive>0 && testdrive<20){
				System.out.println("Thank you! You can now begin your journey!");
				testdrive+=testdrive;
			}
			else if (testdrive<=0) {
				System.out.println("Please enter a valid Input!");
			}
			else if (testdrive>=20) {
				System.out.println("Please enter a number that is smaller than 20!");
			}
		}
		return testdrive;
	}
	public static double gasCalc(double distraveled) {
		gasexpended=distraveled/3;
		gasleft=gasleft-gasexpended;
		
		if (gasleft<0||gasleft==0) {
			System.out.println("Oops! There is no gas left!");
		}
		else if (gasleft>0) {
			System.out.println("Your car currently has "+gasleft+" of gasolines (gallons) left in the car.");
		}
		return Math.round(gasleft*100.00)/100.00;
	}
	//getter methods
	
	public String getColor() {
		return color;
	}
	public String getDescriptioncar() {
		return descriptioncar;
	}
	public String getcondition() {
		return condition;
	}
	//setter methods
	
	public String setColor() {
		this.color=color;
		return color;
	}
	public String setDescriptioncar() {
		this.descriptioncar=descriptioncar;
		return descriptioncar;
	}
	public String setcondition() {
		this.condition=condition;
		return condition;
	}
	public double settravel() {
		this.testdrive=testdrive;
		return testdrive;
	}

}




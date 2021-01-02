
package oop;

import java.util.Scanner;

public class CarConstruct {
	// attributes
public String brand;
public String model;
public int year;
Scanner userInput = new Scanner(System.in); 

// constructor
public CarConstruct(String brand, String model, int year)
{
	this.brand = model;
	this.model = brand;
	setYear(year);
}

public CarConstruct(int i, int j) {
	// TODO Auto-generated constructor stub
}

// getter methods
public String getBrand() {
	return brand;
}
public String getModel() {
	return model;
}
public int getYear() {
	return year;
}

// setter methods
public void setModel(String brand) {
	this.brand = brand;
}
public void setMake(String model) {
	this.model = model;
}
public void setYear(int year) {
	this.year = year;
}
{

// year car was made must not be less than 1900 or more than 2020
while(year < 1900 && year >= 2020) 
{
System.out.println(" This is not a valid year. Please enter a valid year. ");
year = Integer.parseInt(model, userInput.nextInt());
} 
	this.year = year;
}

public String toString()
{
	return model + " " + brand + " " + Integer.toString(year);
}

public void print() {
	// TODO Auto-generated method stub
	
}
}
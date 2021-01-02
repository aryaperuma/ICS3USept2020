package oop;

import java.util.Scanner;

public class CarConstructer3 {
	int numWheels;
	double price;
	
	//default constructor
	public void Vehicle()
	{
		numWheels = 0;
		price = 0;
	}
	
	//parameterized constructor
	public void Vehicle(int n, double p)
	{
		numWheels = n;
		price = p;
	}

	//accessor methods
	public int getNumWheels()
	{
		return numWheels;
	}

	public double getPrice()
	{
		return price;
	}
	
	//mutator methods
	public void setNumWheels(int n)
	{
		numWheels = n;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}

	//method to print the attributes
	public void print()
	{
		System.out.println("Number of wheels : " + numWheels + "\nPrice  : "+price);
	}
	
	String model;
	boolean isAutomatic;
	
	public void Car()
	{
		model = "Ford";
		isAutomatic = true;
	}
	
	// note here how the parameters include the ones passed to the superclass constructor
	public void Car(int n, double p, String m, boolean i)
	{
		model = m;
		isAutomatic = i;
	}

	// accessor and mutator methods
	public String getModel()
	{
		return model;
	}

	public boolean getIsAutomatic()
	{
		return isAutomatic;
	}
	
	public void setModel(String m)
	{
		model =m;
	}
	
	public void setIsAutomatic(boolean i)
	{
		isAutomatic = i;
	}

}

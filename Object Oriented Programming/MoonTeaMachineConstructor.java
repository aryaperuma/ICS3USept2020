package oop;
import java.util.ArrayList;
import java.util.Scanner;

public class MoonTeaMachineConstructor {
public class Tea{
	// variable for company Moon Tea of type String
	public String company = " Moon Tea";
	// variable for types of Moon Tea of type String( milk tea, oolong tea... etc)
	public String brand;
	// size of cup of type String (small, medium large)
	public String size;
	// machines container options of type char (plastic cup, glass cup...etc)
	public char container;
	// boolean value for if tea container is recyclable
	public boolean recyclable = true;
	// Arraylist stating ingredients 
	public ArrayList<String> ingredients = new ArrayList<String>();
	//default constructor
	public Tea() {
		
	}
	public Tea(String brandName) {
		brand = brandName;
	}
	public Tea(String brandName, String sizeOfDrink, char containerType) {
		brand = brandName;
		size = sizeOfDrink;
		container = containerType;
	}
	// accessors
	public String getCompany() {
		return company;
	}
	public String getBrandName() {
		return brand;
	}
	public void setBrandName(String brandName) {
		brand = brandName;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String sizeOfDrink) {
		size = sizeOfDrink;
	}
	public char getContainer() {
		return container;
	}
	public void setContainerType(char containerType) {
		container = containerType;
}
	public boolean getRecycable() {
		return recyclable;
	}
	public void setRecyclable(boolean recyclableOrNot) {
		recyclable = recyclableOrNot;
	}
	// behavioural methods
	// adding ingredients for tea (stored in the arrayList)
	public void mixIngredients() {
		ingredients.add("Milk");
		ingredients.add("Sugar");
		ingredients.add("Fruit Flavouring");
		ingredients.add("Boba");
	}
	//allowing the user to check whats in the tea
	public String checkIngredients() {
		String str ="Ingredients:";
		for(String i: ingredients) {
			str += i + ", ";
		}
		return str;
	}
	public String toString() {
		return brand + "\t" + size + "\t" + recyclable;
	}
}
public class TeaMachine{
	public Tea[][] teas = new Tea[5][6];
	// constructor
	public TeaMachine() {
		
	}
	public Tea[][] getTeas(){
		return teas;
	}
	public void stockTeaMachine() {
		teas[0][0] = new Tea("Milk Tea");
		teas[1][0] = new Tea("Milk Tea");
		teas[2][0] = new Tea("Milk Tea");
		teas[3][0] = new Tea("Milk Tea");
		teas[5][0] = new Tea("Milk Tea");
		teas[0][1] = new Tea("Fruit Iced Tea");
		teas[1][1] = new Tea("Fruit Iced Tea");
		teas[2][1] = new Tea("Fruit Iced Tea");
		teas[3][1] = new Tea("Fruit Iced Tea");
		teas[4][1] = new Tea("Fruit Iced Tea");
		teas[0][2] = new Tea("Oolong Tea");
		teas[1][2] = new Tea("Oolong Tea");
		teas[2][2] = new Tea("Oolong Tea");
		teas[3][2] = new Tea("Oolong Tea");
		teas[4][2] = new Tea("Oolong Tea");
		teas[0][3] = new Tea("Foam Tea");
		teas[1][3] = new Tea("Foam Tea");
		teas[2][3] = new Tea("Foam Tea");
		teas[3][3] = new Tea("Foam Tea");
		teas[4][3] = new Tea("Foam Tea");
		teas[0][4] = new Tea("Slushy");
		teas[1][4] = new Tea("Slushy");
		teas[2][4] = new Tea("Slushy");
		teas[3][4] = new Tea("Slushy");
		teas[4][4] = new Tea("Slushy");
		teas[0][5] = new Tea("Slushy");
		teas[1][5] = new Tea("Slushy");
		teas[2][5] = new Tea("Slushy");
		teas[3][5] = new Tea("Slushy");
		teas[4][5] = new Tea("Slushy");
	}
	// checking stock
	public String checkStock() {
		String str = "Current Stock:";
		for(int row = 0; row < teas.length; row++) {
			// nested for-loop
			for(int column = 0; column < teas[row].length; column++) {
				str += teas[row][column] + "\t\t";
			}
			str += "\n";
		}
		return str;
	}
}
}

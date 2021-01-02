package oop;

public class CoffeeConstructor {
	// constructor class
	// declare your instance variables
String size;
static int numSugars = 0;
static int numCreams;
static String taste;
static String color;
double temp;

CoffeeConstructor(int Creams, String taste1, String color1, double temp1) {
	numCreams = Creams;
	taste = taste1;
	color = color1;
	temp = temp1;
}
CoffeeConstructor (int sugar, int Creams, String taste1, String color1, double temp1){
	numSugars = sugar;
	numCreams = Creams;
	taste = taste1;
	color = color1;
	temp = temp1;
}

//Constructor method - never return any value (always void) - always has the same name as class


// create behavioral methods - what the object does
public void stir () {
	System.out.println("Stirring.......");
	System.out.println("Coffee is ready!");
}
// to add sugar to coffee
public String addSugar(int howMuchSugar) {
	numSugars += howMuchSugar;
	return " Your coffee now has " + numSugars + " sugar(s) in it";
}
// getter method - accessors
public String getTaste() {
return taste;
}
public String getColor() {
return color;
}
public double getTemp() {
return temp;
}
public int getNumCreams() {
return numCreams;
}
public int getNumSugars() {
return numSugars;
}
	

//setter method - set the value of an instance variable- modifier
public double setTemp (int temp1) {
	temp = temp1;
	return temp;
}
public String setTaste ( String taste1) {
	taste = taste1;
	return taste;
}
public String setColor(String color1) {
	color = color1;
	return color;
}
public int numSugars (int amountSugar) {
	numSugars = amountSugar;
		return numSugars;
	}
public int numCreams (int amountCream) {
	numCreams = amountCream;
	return numCreams;
}
// Overwriting the toString method
public String toString() {
	return " This is a coffee making program. Your coffee has " + numSugars + " sugars in it" + "Its temprature is: " + temp;
	
}
}


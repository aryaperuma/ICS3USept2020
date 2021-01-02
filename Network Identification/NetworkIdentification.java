package collaborativeAssignments;

import java.util.Scanner;

public class NetworkIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner userInput=new Scanner(System.in); //creating an instance for Java class Scanner

//welcoming user and prompting them for input 
System.out.println("Welcome! Please enter your name:");
String name = userInput.nextLine();

System.out.println("\nHello, "+name+"! Please enter the first octet:");
int octet1=Integer.parseInt(userInput.nextLine());

System.out.println("\nPlease enter the second octet:");
int octet2=Integer.parseInt(userInput.nextLine());

System.out.println("\nPlease enter the third octet:");
int octet3=Integer.parseInt(userInput.nextLine());

System.out.println("\nPlease enter the fourth octet:");
int octet4=Integer.parseInt(userInput.nextLine());

if (octet1>=0&&octet1<=255&&octet2>=0&&octet2<=255&&octet3>=0&&octet3<=255&&octet4>=0&&octet4<=255) //check if all four integers are within range (0-255)
		if (octet1==128&&octet2==32&&octet3==43&&octet4==1)//if all integers are within range, check if octet value matches IP Address
			System.out.println("\nNetwork Identified"); //let the user know network is identified if IP Address matches
		else 
			System.out.println("\nIP Address: "+octet1+"."+octet2+"."+octet3+"."+octet4+"\nNetwork Not Identified"); //letting user know the IP address does not match IP address in the system
else //check which integer is not within range and display on the screen for user to know
		if (!(octet1>=0 && octet1<=255))
			System.out.println("Octet 1 is incorrect");
		if (!(octet2>=0 && octet2<=255))
			System.out.println("Octet 2 is incorrect");
		if (!(octet3>=0 && octet3<=255))
			System.out.println("Octet 3 is incorrect");
		if (!(octet4>=0 && octet4<=255))
			System.out.println("Octet 4 is incorrect");
	
	}

}



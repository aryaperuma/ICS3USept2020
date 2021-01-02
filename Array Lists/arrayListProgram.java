//Objective: Removing one name from a list of names which the user inputs
package exitTicket;

import java.util.Scanner;
import java.util.ArrayList;

public class arrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner (System.in);
		
		ArrayList<String> names=new ArrayList<String>(); 
		
		// list of names
		names.add("Arya");
		names.add("Isabella");
		names.add("Sabrina");
		names.add("John");
		names.add("Jack");
		names.add("Angel");
		names.add("Adrien");
		names.add("Michael");

	      //displaying initial list
	      System.out.println(" \nInitial List: " + names + " \nWho shall be kicked off the list? ");
	      
	      //Removing "Isabella"
	      names.remove(Input.next());

	      //displaying final list
	      System.out.println(" \nFinal List " + names);
	      
	      
	   }
	}



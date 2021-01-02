package arrays;

import java.util.Scanner;

public class FamilyProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		String [] familyNames = { "Dad", "Mom", "Sister", "Grandfather", "Grandmother" }; 
		
		for(int j=0; j<familyNames.length; j++) {
			System.out.println(familyNames[j]);
		}
		int [] familyAges = new int[5];
		double sumOfAges = 0;
		
		System.out.println("Please enter the ages of all your family members ");
		for(int j = 0; j<familyAges.length; j++) {
			System.out.println("Family member" + (j+1) + ":");
			familyAges[j] = userInput.nextInt();
			sumOfAges += familyAges[j];
			}
		for(int j = 0; j< familyAges.length; j++) {
			System.out.println(familyAges[j]);
		}
		System.out.println(sumOfAges/5 + " years old is the average of your family's ages.");
		
		}
	}


	
	
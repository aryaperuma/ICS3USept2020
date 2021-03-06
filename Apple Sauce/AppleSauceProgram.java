// Title: Apple Sauce Program
// Author: Arya Peruma
// Date: October 13th, 2020
// Description: This program will print a list of numbers from 1 to 100, however if the number is a multiple of 3, "Apple" will be printed and if it is a multiple of 5, "Sauce" will be printed. If it is both a multiple of 3 and 5, " Apple Sauce" will be printed.
package independentAssignments;

import java.util.Scanner;

public class AppleSauceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer greater than or equal to 1:");
		int num = input.nextInt(); // Initializing the variable num, and giving it a value of 100

		for (int i = 1; i <= num; i++) // Utilizing a For Loop to start the count at 1, and end at the number I
										// initialized in line 7 while incrementing the count by 1 each time
		{
			if (((i % 3) == 0) && ((i % 5) == 0))// Checks which numbers in the list are multiples of both 3 and 5
				System.out.println("Apple Sauce");// If the number meets the conditions stated in line 11 "Apple Sauce"
													// will be printed
			else if ((i % 3) == 0) // Checks which numbers in the list are multiples of 3
				System.out.println("Apple"); // If the number meets the conditions stated in line 13 "Apple" will be
												// printed
			else if ((i % 5) == 0) // Checks which numbers in the list are multiples of 5
				System.out.println("Sauce"); // If the number meets the conditions stated in line 15 "Sauce" will be
												// printed
			else
				System.out.println(i); // If number is not a multiple of 3 or 5 the number itself will be printed
		}
	}

}

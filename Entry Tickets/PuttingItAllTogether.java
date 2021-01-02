// Title: Even Number Generator
// Author: Arya Peruma
// Date: October 14th, 2020
// Description: Code will ask user to input 2 integers, and print a list of all numbers which are even, including the integers which the user inputed
package entryTicket;

import java.util.Scanner;

public class PuttingItAllTogether {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer:");
		int int1 = input.nextInt();
		System.out.print("Enter a larger integer:");
		int int2 = input.nextInt();
		int i = int1;

		while (i <= int2) {
			if (i % 2 == 0) { // Checking if number is divisible by 2
				System.out.println(i);
			}
			i++;
		}
	}
}

package arrays;

import java.util.Scanner;

// Title: To enter heights of all basketball players in a team and find average height
public class ArraysAndMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userIn = new Scanner(System.in); // scanner object
		System.out.println("Enter the number of players in your team"); // print statement
		int numPlayers = userIn.nextInt(); // asking the user how many players are in the team
		double playerHeights[] = new double[numPlayers]; // dynamic of an array
		for (int i = 0; i < playerHeights.length; i++) { // 12 players // scanning the array elements from the user
			System.out.println("Give player" + (i + 1) + " 's height in cm ");
			playerHeights[i] = userIn.nextDouble();
		}
		System.out.println(" The demographics of the players are: \n");
		printArray(playerHeights);
		System.out
				.println(" The average height is: " + Math.round((avgH(playerHeights)) / playerHeights.length) + "cms");
		update(playerHeights, 2, 185.0);
		printArray(playerHeights); // calling the print Array method
		swap(playerHeights, 1, 3);
		System.out.println("");
		printArray(playerHeights);
	}

	public static void printArray(double[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i + 1) + " . " + "\t" + arr[i]);
		}
	}

	public static double avgH(double[] array) { // to calculate sum of all elements in the array
		double total = 0;
		for (int i = 0; i < array.length; i++) {
			total += array[i];
		}
		return total;
	}

	// creating a method which will accept an index as a parameter and update its
	// contents
	// update player 2's height to be 185 cms
	public static void update(double[] array, int index, double height) {
		array[index] = height;
	}

	public static void swap(double[] array, int i, int j) { // to swap the contents of two elements
		double temp = array[i]; // preserving the contents of index i into temporary variable
		array[i] = array[j]; // LHS will replace its content with RHS
		array[j] = temp;
		{
		}
	}

}

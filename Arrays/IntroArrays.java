package arrays;

import java.util.Scanner;

public class IntroArrays {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Hard-coding an array
		// TODO Auto-generated method stub
		int [] pHeight = new int [12]; // declare an array of type integer and size 12
		// Arrays are Dynamic object;
		for(int j=0; j<pHeight.length; j++) {
			System.out.println("Enter the height of Player #" + (j + 1));
			pHeight[j] = in.nextInt();
		}
		System.out.println("The heights of players are:");
		
		for( int i=0; i<pHeight.length; i++) {
			System.out.println((i + 1) + ".\t" + pHeight[i]);
	
		}
		System.out.println("Length of the array:" + pHeight.length);
		// Traversing - scan all the elements in the array>> USE A 'FOR' LOOP
		//System.out.println("The elements of the array are:");
	// Program should return how many players are taller than 190 cm	
		int counter = 0;
		for( int i=0; i<pHeight.length; i++) {
			if (pHeight[i] > 190) {
				counter++;
			}
	
			
		}
		System.out.println("No. of playes taller than 190 cms are:" + counter);
	
	}

}

// 3 ways you can initialize an array 1) use separate initializing statements array[i] = 
// 2) hard code using {value, value, value}
// 3) using a scanner

/* ARRAY: built-in java Function (Object)
 * element labels start from 0=> an array of size 5 will have 0 to 4 elements.
 * any 'n' size array will have element from 0 to 'n-1'
 */






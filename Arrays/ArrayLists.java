package arrays;

import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		
				boolean ifPrime = true;
				int num = 0;
				// try executing a block of code and catch - to continue running the program when user inputted another data type
				boolean check = false;
				try {
					System.out.println(" Enter a number");
					num = in.nextInt();
				}
				catch ( RuntimeException ex) {
					System.out.println("Invalid input");
					check = true;
					
				}
				for (int j =0; j<10; j++)
				while (check)
				{
				System.out.println(" The program is still running");
				for (int i = 2; i < num; i++) {
					if(num%i==0) {
						i = num;
						System.out.println(" Number is not prime");
						ifPrime = false;
					}
					if (i == num-1)
System.out.println(" Number is prime" );
				}
	}

	{
	}

	{

	}

	}
}

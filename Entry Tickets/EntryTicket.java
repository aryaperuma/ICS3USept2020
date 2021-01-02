package entryTicket;

import java.util.Scanner;

public class EntryTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Enter Your Scores: \n Input -1 to calculate average.");
		    Scanner scanner = new Scanner(System.in);
		    int scores = 0;
		    int total = 0;
		    int count = -1;
		    while ((scores = scanner.nextInt()) != -1) {
		      total =+ scores;
		      ++count;
		    }
		    System.out.println("The average is: " + (double) (total + 1) / (count -1));
		  }
		}

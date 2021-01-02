package independentAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class CritiqueTesterImproved {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hey Filmmaker! Let's Make a Teaser for your Movie!\n");
		CritiqueConstructorImproved teaser = new CritiqueConstructorImproved(); // CREATED AN INSTANCE OF THE
																				// CONSTRUCTOR CLASS/OBJECT WITHOUT
																				// INSTANTIATING POSITIONS FOR VARIABLES
																				// DEFINED IN THE CONSTRUCTOR CLASS
		// REMOVED THE LETS START OF WITH YOUR NAME PROMPT AS IT WAS ALREADY DEFINED IN
		// THE CONSTRUCTOR CLASS
		teaser.setDirectorName();
		System.out.println("Great!");
		teaser.getBefore();
		teaser.getProdCompany();
		System.out.println("Perfect!");
		System.out.println("\nNow, lets move on to the Genre.");
		teaser.getGenre();
		System.out.println("\nThe Movie needs a Name!");
		teaser.getTitle();
		System.out.println("Interesting Title!");
		System.out.println("\nWe need a Cast!");
		int castSize = safeInput("How many Lead Cast Members do you want?:"); // DEFINED SAFEINPUT TO ACCOUNT FOR ALL
																				// TEST CASES AND EXTEND OBJECT
		// REMOVED BOOLEAN INVALID EQUALS TRUE STATEMENT AS WELL AS PRECEEDING WHILE
		// LOOP
		teaser.cast = new ArrayList<String>(castSize); // REMOVED UNECASSARY LOGIC PERTRAINING THE ARRAY LIST AND
														// CASTING WITH VARIABLE CASTSIZE RATHER THAN INT
		teaser.setCast(castSize); // CHANGED CAST TO VARIABLE CASTSIZE
		// REMOVED UNECASSARY TRY AND CATCH STATEMENT
		System.out.println("\nA good Teaser always has Music.");
		// REMOVED UNECASSARY TRY AND CATCH STATEMENT
		teaser.getMusic(); // REMOVED UNECASSARY LOGIC AND JUST SET THE OBJECT
		int year = safeInput("\nWhat year is the Movie coming out?"); // USED SAFEINPUT TO ASK USER FOR YEAR
		teaser.setYear(year); // REMOVED UNECASSARY LOGIC AND JUST SET THE OBJECT
		// REMOVED UNECASSARY TRY AND CATCH STATEMENT
		int rating = safeInput("\nWhat Rating did your Film get from early reviews?: (Range is 1 - 5)");
		teaser.setRating(rating); // REMOVED UNECASSARY LOGIC AND JUST SET THE OBJECT
		// REMOVED UNECASSARY TRY AND CATCH STATEMENT
		String stars = getStars(rating); // GETTING STARS AND RATING
		System.out.println();
		teaser.arrangements();
		teaser.hiring();
		teaser.finalizing();
		teaser.playing();
		System.out.println(teaser.toString() + "\nEarly Reviews: " + stars);
	}

	public static int safeInput(String message) { // CREATING A METHOD FOR SAFEINPUT AND GIVING IT PARAMETER MESSAGE OF
													// TYPE STRING
		while (true) { // WHILE LOOP TO ACCOUNT FOR ALL TEST CASES
			try { // TRY AND CATCH TO CATCH ALL LOOPOLES IN REGARDS TO TEST CASES
				System.out.println(message);
				int returnValue = input.nextInt(); // RETURNING THE NEXT INT VALUE
				return returnValue; // RETURN STATEMENT TO RETURN VALUE
			} catch (RuntimeException ex) { // CATCHING THE ERROR
				System.out.println("Invalid Input"); // DISPLAYING INVALID INPUT
				input.nextLine();
			}
		}
	}

// THIS METHOD IS TO MAKE PRINTING THE STARS MORE EFFICIENT IN COMPARISON TO USING A BUNCH OF IF STATEMENTS
	public static String getStars(int rating) { // METHOD TO GET STARS TO DISPLAY FOR RATING OF TYPE STRING AND GIVING
												// IT PARAMETER OF RATING
		String stars = "";
		for (int i = 0; i < rating; i++) { // FOR LOOP TO PRINT STARS DEPENDING ON RATING USER INPUTS
			stars += "*"; // DEFINING THE SYMBOL THATSHOUL BE PRINTED
		}
		return stars; // RETURNING VARIABLE STARS
	}

}

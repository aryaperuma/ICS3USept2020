package independentAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class CritiqueTesterOriginal {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hey Filmmaker! Let's Make a Teaser for your Movie!\n");
		CritiqueConstructorOriginal teaser = new CritiqueConstructorOriginal(null, null, null, null, null, false, 0, 0,
				null);
		System.out.println("Let\'s start off with your Name.");
		teaser.Dname();
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
		// I have an issue in this part
		boolean invalid = true;
		while (invalid) {
			try {
				System.out.println("How many Lead Cast Members do you want?:");
				ArrayList<String> cast = teaser.cast = new ArrayList<String>(
						(int) Math.abs(Math.round(Double.parseDouble(input.nextLine()))));
				teaser.setCast(cast);
				invalid = false;
			} catch (RuntimeException ex) {
				System.out.println("Invalid Input");
			}
		}
		System.out.println("\nA good Teaser always has Music.");
		teaser.getMusic();
		boolean invalid1 = true;
		while (invalid1) {
			try {
				System.out.println("\nWhat year is the Movie coming out?");
				double year = teaser.setYear(Math.abs(Math.round(Double.parseDouble(input.nextLine()))));
				invalid1 = false;
			} catch (RuntimeException ex) {
				System.out.println("Invalid Year");
			}
		}
		boolean invalid2 = true;
		while (invalid2) {
			try {
				System.out.println("\nWhat Rating did your Film get from early reviews?: (Range is 1 - 5)");
				double rating = teaser.setRating(Math.abs(Math.round(Double.parseDouble(input.nextLine()))));
				invalid2 = false;
			} catch (RuntimeException ex) {
				System.out.println("Invalid Rating");
			}
		}
		String stars = "";
		if (teaser.rating == 5) {
			stars = "*****";
		}
		if (teaser.rating == 4) {
			stars = "****";
		}
		if (teaser.rating == 3) {
			stars = "***";
		}
		if (teaser.rating == 2) {
			stars = "**";
		}
		if (teaser.rating == 1) {
			stars = "*";
		}
		System.out.println("");
		teaser.arrangements();
		teaser.hiring();
		teaser.finalizing();
		teaser.playing();
		System.out.println(teaser.toString() + "\nEarly Reviews: " + stars);
	}
}

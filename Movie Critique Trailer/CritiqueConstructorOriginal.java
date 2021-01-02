package independentAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class CritiqueConstructorOriginal {
	static Scanner input = new Scanner(System.in);
	boolean before;
	String title, genre, music, prodCompany, Dname;
	double rating;
	int year;
	ArrayList<String> cast = new ArrayList<String>();

	CritiqueConstructorOriginal(String title, String genre, String music, String prodCompany, String Dname,
			boolean before, double rating, int year, ArrayList<String> cast) {
		super();
		this.title = title;
		this.genre = genre;
		this.music = music;
		this.prodCompany = prodCompany;
		this.Dname = Dname;
		this.before = before;
		this.rating = rating;
		this.year = year;
		this.cast = cast;
	}

	String beforeInfo = "";

	// Behavior
	public void Dname() {
		System.out.println("Enter your First Name: ");
		String Fname = input.nextLine();
		Fname = Fname.substring(0, 1).toUpperCase() + Fname.substring(1).toLowerCase();
		System.out.println("Enter your Last Name: ");
		String Lname = input.nextLine();
		Lname = Lname.substring(0, 1).toUpperCase() + Lname.substring(1).toLowerCase();
		Dname = Fname + " " + Lname;
	}

	public void arrangements() {
		System.out.println("Making Arrangements with " + prodCompany + "...");
	}

	public void hiring() {
		System.out.println("Hiring the Cast...");
	}

	public void finalizing() {
		System.out.println("Finalizing the Teaser for " + title + "...");
	}

	public void playing() {
		System.out.println("Playing " + music + " music...");
	}

	// Getter
	public boolean getBefore() {
		System.out.println("\nHave you Directed a Movie Before?");
		String YN = input.nextLine().toLowerCase();
		boolean bRepeat = true;
		while (bRepeat) {
			if (YN.equals("yes")) {
				System.out.println("Great, so you know the Basics!");
				before = false;
				bRepeat = false;
			} else if (YN.equals("no")) {
				System.out.println("That\'s OK we'll guide you through every question.");
				before = true;
				bRepeat = false;
			} else {
				System.out.println("Invalid. Type \"Yes\" or \"No\" ");
				System.out.println("\nHave you Directed a Movie Before?");
				YN = input.nextLine().toLowerCase();
			}
		}
		return before;
	}

	public String getProdCompany() {
		if (before == true) {
			beforeInfo = "(Ex. Paramount Pictures, 20th Century Studios, Lucasfilm)";
		} else {
			beforeInfo = "";
		}
		System.out.println("\nWho is your Production Company?: " + beforeInfo);
		return prodCompany = input.nextLine().toUpperCase();
	}

	public String getGenre() {
		if (before == true) {
			beforeInfo = "(Genres are Categories that Define a Movie based on its Narrative Elements)";
		} else {
			beforeInfo = "";
		}
		System.out.println("Pick a Genre from the List: " + beforeInfo);
		System.out.println("\nAction \nHorror \nDrama \nComedy \nSci-Fi \nRomance");
		System.out.println("\nYour Choice?:");
		genre = input.nextLine().toLowerCase();
		boolean gRepeat = true;
		while (gRepeat) {
			if (genre.equals("action") || genre.equals("horror") || genre.equals("drama") || genre.equals("comedy")
					|| genre.equals("sci-fi") || genre.equals("romance")) {
				System.out.println("Great Decision!");
				gRepeat = false;
			} else {
				System.out.println("Invalid Genre");
				System.out.println("\nYour Choice?:");
				genre = input.nextLine().toLowerCase();
			}
		}
		return genre = genre.substring(0, 1).toUpperCase() + genre.substring(1).toLowerCase();
	}

	public String getTitle() {
		if (before == true) {
			beforeInfo = "(Make sure the title is something exciting that draws attention)";
		} else {
			beforeInfo = "";
		}
		System.out.println("Enter the Title of your Movie: " + beforeInfo);
		return title = input.nextLine().toUpperCase();
	}

	public String getMusic() {
		if (before == true) {
			beforeInfo = "(Try to choose a Music type that Matches the Genre of " + genre + ")";
		} else {
			beforeInfo = "";
		}
		System.out.println("Select a type of Music for your Teaser " + beforeInfo);
		System.out.println("\nHip-Hop \nRock \nClassical \nJazz");
		System.out.println("\nYour Choice?:");
		music = input.nextLine().toLowerCase();
		boolean mRepeat = true;
		while (mRepeat) {
			if (music.equals("hip-hop") || music.equals("rock") || music.equals("classical") || music.equals("jazz")) {
				System.out.println("This will fit nicely in your Teaser.");
				mRepeat = false;
			} else {
				System.out.println("Invalid Music Type");
				System.out.println("\nYour Choice?:");
				music = input.nextLine().toLowerCase();
			}
		}
		return music = music.substring(0, 1).toUpperCase() + music.substring(1).toLowerCase();
	}

	// Setter
	public double setRating(double stars) {
		rating = stars;
		boolean rRepeat = true;
		while (rRepeat) {
			if (rating > 5 || rating < 1) {
				System.out.println("Invalid Rating");
				System.out.println("Rating: ");
				rating = Math.abs(Math.round(Double.parseDouble(input.nextLine())));
			} else {
				rRepeat = false;
			}
		}
		return rating;
	}

	public double setYear(double releaseYear) {
		year = (int) releaseYear;
		boolean yRepeat = true;
		while (yRepeat) {
			if (year < 2020) {
				System.out.println("Invalid Year");
				System.out.println("Year: ");
				year = (int) Math.abs(Math.round((Double.parseDouble(input.nextLine()))));
			} else {
				yRepeat = false;
			}
		}
		return year;
	}

	// I have an issue in this part
	public ArrayList<String> setCast(ArrayList<String> numCast) {
		double num = numCast.size();
		System.out.println("Enter the first and last names of the Lead Cast Members");
		for (int i = 0; i < num; i++) { // this for loop asks the user for each cast member
			System.out.println("Enter Cast Member #" + (i + 1));
			cast.add(input.nextLine());
		}
		return cast;
	}

	public String toString() {
		return prodCompany + " Presents...\nThe Most Anticipated " + genre + " Movie of the Year...\nAn " + Dname
				+ " Film...\n\n\t" + title + "\n\nStarring: " + cast + "\nComing in " + year + " only in Theatres...";
	}
}

package independentAssignments;

import java.util.ArrayList;
import java.util.Scanner;

public class CritiqueConstructorImproved {
	static Scanner input = new Scanner(System.in);
	boolean before;
	String title, genre, music, prodCompany, directorName; // CHANGED VARIABLE DNAME TO DIRECTOR NAME TO MAKE VARIABLE
															// MORE SELF EXPLANATORY AND UNDERSTANDABLE
	int rating; // CHANGED VARIABLE RATING TO INT SINCE STARS ARE 1-5 AND HAVE TO BE AN INT
	int year;
	ArrayList<String> cast = new ArrayList<String>();

	public CritiqueConstructorImproved(String title, String genre, String music, String prodCompany,
			String directorName, boolean before, int rating, int year, ArrayList<String> cast) {
		super();
		this.title = title;
		this.genre = genre;
		this.music = music;
		this.prodCompany = prodCompany;
		this.directorName = directorName;
		this.before = before;
		this.rating = rating;
		this.year = year;
		this.cast = cast;
	}

	public CritiqueConstructorImproved() { // ADDING A SECOND OVERWRITTEN CONSTRUCTOR METHOD TAKEN FROM LINE 9 OF
											// CRITIQUETESTERORIGINAL AND PLACING IT HERE, INSTANTIATING WITH NULL
											// VALUES FOR STRING VARIABLES
		this(null, null, null, null, null, false, 0, 0, null);
	}

	String beforeInfo = "";

	// Behavior
	public void setDirectorName() { // USING SETDIRECTORNAME AS A BEHAVIOURAL METHOD TO GET THE USERS NAME
		System.out.println("Let\'s start off with your Name."); // EXTRA LINE TO EXPLAIN TO THE USER WHAT IS HAPPENING
		System.out.println("Enter your First Name: ");
		String firstName = input.nextLine(); // CHANGED VARIABLE FNAME TO FIRSTNAME FOR ADDED CLARITY
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		System.out.println("Enter your Last Name: ");
		String lastName = input.nextLine(); // CHANGED VARIABLE LNAME TO LASTNAME FOR ADDED CLARITY
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
		directorName = firstName + " " + lastName;
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
	public void setRating(int stars) { // CHANGING METHOD RETURN TYPE TO VOID AND USING INT STARS AS A PARAMETER
										// INSTEAD OF DOUBLE STARS
		rating = stars;
		boolean rRepeat = true;
		while (rRepeat) {
			if (rating > 5 || rating < 1) {
				System.out.println("Invalid Rating");
				System.out.println("Rating: ");
				rating = input.nextInt(); // REMOVING UNECASSARY LOGIC (FOR THIS LINE ROUNDING AND TAKING THE ABSOLUTE
											// VALUE IS NOT NECASSARY AS TH IF STATEMENT 3 LINES ABOVE DOES THIS
											// ALREADY)
			} else {
				rRepeat = false;
				// REMOVING RETURN STATEMENT AS SPECIFIC METHOD DOES NOT NEED TO RETURN RATING
				// BECAUSE IT IS ALREADY RETURNED IN THE ABOVE IF ELSE STATEMENT
			}
		}
	}

	public void setYear(int releaseYear) { // CHANGING METHOD RETURN TYPE TO VOID
		year = releaseYear; // REMOVED CASTING OF INTEGER
		boolean yRepeat = true;
		while (yRepeat) {
			if (year < 2020) {
				System.out.println("Invalid Year");
				System.out.println("Year: ");
				year = input.nextInt(); // REMOVED UNECASSARY LOGIC OF CASTING, ROUNDING AND TAKING THE ABSOLUTE VALUE,
										// AS PREVIOUSLY DEFINED LOGIC FOR VARIABLE YEAR STATES THE RESTRICTIONS AND
										// TAKES DECIMALS AND NEGATIVE NUMBERS INTO ACCOUNT
			} else {
				yRepeat = false;
				// REMOVING RETURN STATEMENT AS SPECIFIC METHOD DOES NOT NEED TO RETURN THE YEAR
			}
		}
	}

	public void setCast(int numCast) { // REPLACED ARRAYLIST WITH METHOD SETCAST WITH RETURN TYPE VOID AS ARRAY LIST
										// DEFINED ABOVE CAN BE ACCESSED FROM HERE
		System.out.println("Enter the first and last names of the Lead Cast Members");
		// REMOVED double num = numCast.size(); AS list.size() WAS PREVIOUSLY USED AS
		// THE RANGE IN THE FOR LOOP, DEFINING IT WITH A VALUE OF 0, WHICH IS THE REASON
		// BEHIND THE SKIPPING OF THE LINE WHERE THE USER IS ASKED FOR THE LEAD CAST
		// MEMBERS NAMES
		for (int i = 0; i < numCast; i++) { // this for loop asks the user for each cast member - WROTE i < numcast
											// RATHER THAN i < num SO THE FOR LOOP CAN WORK EFFECTIVLY AND LOOP
											// DEPENDING ON THE NUMBER OF LEAD CAST MEMBERS THE USER ENTERS
			System.out.println("Enter Cast Member #" + (i + 1));
			cast.add(input.nextLine());
		}
	}

	public String toString() {
		return prodCompany + " Presents...\nThe Most Anticipated " + genre + " Movie of the Year...\nAn " + directorName
				+ " Film...\n\n\t" + title + "\n\nStarring: " + cast + "\nComing in " + year + " only in Theatres...";
	}
}

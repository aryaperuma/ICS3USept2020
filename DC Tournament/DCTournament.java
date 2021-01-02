package independentAssignments;

//Public class of DCTournament
public class DCTournament {
	// main method
	public static void main(String[] args) {

		// Used the choices array to choose between battle heroes and villains
		String choices[] = { "Harley Quinn", "Joker", "Batman", "Poison Ivy", "Superman" };

		// Created a string array playerChoices with all possible choices
		String playerChoices[] = { choices[0], choices[1], choices[2], choices[3], choices[4] };

		System.out.println(" *********************************");
		System.out.println(" * Welcome to the DC Tournament! *");
		System.out.println(" *********************************");

		// initialized a variable win of type int to calculate the points gained
		// throughout the game for the player
		int win = 0;
		// initialized a variable lose of type int to calculate the points gained
		// throughout the game for the computer
		int lose = 0;

		// using a for-each loop to get the players choice from array choice
		for (String player : choices) {
			// using the player variable intialized as a String to display what the player
			// chose
			System.out.println("You chose: " + player);
			// using the method computerChoice to randomize computers choices
			String opponent = computerChoice(choices);
			// using the opponent variable intialized as a String to display what the
			// computer chose
			System.out.println("Computer chose: " + opponent);

			// checking if the player and opponent chose the same battle hero/villain
			if (player == opponent) {
				// if conditions stated in line 20 are met, print "It's a draw"
				System.out.println("It's a draw");
				// calling the method dc with player, opponent, and choices as parameters in the
				// condition of else if, and is based on the results of the dc method starting
				// on line 42
			} else if (dc(player, opponent, choices)) {
				// based on the results of the dc method starting line 42, print "You win" if
				// true was returned
				System.out.println("You win");
				// score increments by 1 for the winning team of that round
				win++;
				// else statement to be executed if none of the above conditions are met
			} else {
				// if else statement is executed then " You lose" is printed
				System.out.println("You lose");
				// losing score is incremented by 1 for the losing team of that round
				lose++;
			}

		}

		// Displaying Final Scoreboard
		System.out.println(" ********************");
		System.out.println(" * Final Scoreboard *");
		System.out.println(" ********************");
		// Printing the amount of final points you won
		System.out.println(" You: " + win);
		// Printing the amount of final points you lose
		System.out.println(" Computer: " + lose);
	}

	// Created a method computerChoice with return type string to get a random
	// number up to 5 and convert it into an int (has parameter of array choices)
	public static String computerChoice(String choices[]) {
		// getting a random number up to 5 to randomize battle heroes/villains played by
		// you and the computer
		double randomNum = Math.random() * 5;
		// casting the num into an int to match any value from array playerChoices
		int num = (int) randomNum;
		// returning the choice
		return choices[num];
	}

	// Created a method dc with parameters player opponent and the choices array
	// defined in line 9 all of type String to test all possible battle scenarios
	public static Boolean dc(String player, String opponent, String choices[]) {
		// Adding if conditions for every single possible battle case and checking them
		// all in one if statement
		if (player == choices[0] && opponent == choices[2] || player == choices[2] && opponent == choices[1]
				|| player == choices[1] && opponent == choices[0] || player == choices[0] && opponent == choices[3]
				|| player == choices[3] && opponent == choices[4] || player == choices[2] && opponent == choices[3]
				|| player == choices[3] && opponent == choices[1] || player == choices[1] && opponent == choices[4]
				|| player == choices[4] && opponent == choices[0]) {
			// if any of the above conditions are met then return true
			return true;
		} else {
			// if none of the above conditions are met return false
			return false;
		}
	}
}

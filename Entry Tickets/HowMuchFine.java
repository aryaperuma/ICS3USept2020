package entryTicket;

import java.util.Scanner;

public class HowMuchFine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println(" Hello! Enter your Name! ");
		String name = input.nextLine(); 
		System.out.print("\nWelcome, " + name + "! Ender your speed. ");
		int speed = input.nextInt();
		if (speed <= 40 ) {
			System.out.println(" Congrats, " + name + " You have no fines or warning. " );
		} else if (speed < 50 && speed >= 41) {
			System.out.println(" You have a speed warning " + name + ".");
		} else {
			System.out.println( name + " You are above the speed limit and need to pay " + (speed-50) *5 + " dollars "  );
		}
	}

	}



//user will enter speed
// every one km above 50km you pay 5 dollars per km
// between 41km - 50km you get a warning
// if you are 40km or below you get no warning
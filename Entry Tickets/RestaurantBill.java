package entryTicket;

import java.util.Scanner;

public class RestaurantBill {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
				double mealCost;
		double tax;
		double totalCost;
		double tip;
		double totalBill;
		
		System.out.println("Please enter the cost of your meal:");
		mealCost = scanner.nextDouble();
		
		tax = 0.13 * mealCost;
		
		totalCost = mealCost + tax;
		
		tip = 0.2 * totalCost;
		
		totalBill = totalCost + tip;
		
		System.out.println("Cost of meal: $" + mealCost);
		System.out.println("Ta: $" + tax);
		System.out.println("Tip: $" + tip);
		System.out.println("Total Bill: $" + mealCost);

	}

}

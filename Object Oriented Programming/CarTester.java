package oop;
import java.util.Scanner;
public class CarTester {

	public static void main(String[] args) {
		Scanner userInput= new Scanner(System.in);
	
		CarConstructor refer=new CarConstructor("Red", "Sports Car", "Brand New");

		System.out.println("Hello Client! Welcome to Los Pollos Hermanos Car Service!\nTo start, we have given you a Dodge Hellcat to test things out.");
		System.out.println("Menu:\n1) Basic Information about Your Car\n2) Test Drive\n3) Check Gas Left in Car\n4) Stop the Testdrive System");
		//initializing variables
		boolean condition=true;
		double userinput=0;
		while (condition)
		{
			try 
			{
			System.out.println("Please Enter a Number that Corresponds to the Menu: ");
			userinput=Math.round(Double.parseDouble(userInput.nextLine()));
			}
			catch (RuntimeException ex) 
			{
				System.out.println("Please Enter a Valid Input!");
			}
			if (userinput==1) {
				System.out.println(refer.basicinfo());
			}
			else if (userinput==2) {
				refer.startup();
				refer.testdrive();
			}
			else if (userinput==3) {
				refer.gasCalc(refer.testdrive);
			}
			else if (userinput==4) {
				refer.exitcar();
				System.out.println("Thank you for coming to Los Pollos Hermanos Car Service!");
			condition=false;
			}
			else if (userinput<=0||userinput>4) {
				System.out.println("Please Enter a Valid Input!");
			}
		}
	}

}





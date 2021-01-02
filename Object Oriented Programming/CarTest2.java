package oop;
import java.util.Scanner;

public class CarTest2 {
	 public static void main(String[] args) {                
	        //create a Car object and assign it to car
	        CarConstruct2 car = new CarConstruct2();
	         
	        //create a Scanner object to obtain input from the command window.
	        Scanner keyb = new Scanner(System.in);
	         
	        System.out.print("Please enter the make and model of the car: ");
	        String m = keyb.nextLine();
	        System.out.println("New car created! " + car.getMake() + ", " + car.getYearModel()); 
	                         
	        //Accelerate
	        for(int i=0; i<5; i++){
	            if (i >= 0 && i <= 210)
	            car.accelerate();
	            System.out.println("The current speed is " + car.getSpeed());
	        }   
	 
	         //Brake
	        for(int i=0; i<5; i++){
	            if (i >= 0 && i <= 210)
	            car.brake();
	            System.out.println("The current speed is " + car.getSpeed());
	        }  
	        System.out.println("The current speed is " + car.getSpeed() + ", and the brakes were applied 6 times.");
	                 
	        }
	}


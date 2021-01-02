package oop;

import java.util.Scanner;



public class careerTester_BH {

 

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        careerConstructor_BH miner = new careerConstructor_BH(null, 0, 0, null);
        
        System.out.println("Welcome! You can choose to mine or craft materials.");

 

        boolean valid = true;
        String input = userInput.nextLine();
        
        while (valid) {
            if(input.equalsIgnoreCase("exit")) {
                System.out.println("See you again soon!");
                valid = false;
            }
            else {
                
                if(input.equalsIgnoreCase("Mine")) {
                    miner.mining();
                }
}
}
    }
}
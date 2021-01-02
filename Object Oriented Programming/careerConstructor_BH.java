package oop;

import java.util.Scanner;
public class careerConstructor_BH {

 

    String materialType;
    double materialQuantity;
    int miningTools;
    String miningLocation;
    
    careerConstructor_BH(String materialType, double materialQuantity, int miningTools, String miningLocation) {
        this.materialType = materialType;
        this.materialQuantity = materialQuantity;
        this.miningTools = miningTools;
        this.miningLocation = miningLocation;
    }

 

    static Scanner userInput = new Scanner(System.in);
    String input = userInput.nextLine();
    
//Behavioral Method
    public void mining() {
    System.out.println("You chose to do mining today, please enter a number to select a tool(s) for your assistance:"
                     + "\n1. PickAxe: It is good for extracting ores."
                     + "\n2. Shovel: It is good to remove dirt and gravel on surface mines."
                     + "\n3. Loader: It carries up the mined materials."
                     + "\n4. Torch: Used to light up the way."
                     + "\n5. ATT: If you want to use select all the tools.");
}
}

package oop;
import java.util.Scanner;

public class CarConstructor2 {
	 private String brand;
	    private String model;
	    private int yearOfMake;
	    private String engineTransmissionType;
	    private String fuelType;
	    private String colour;
	    private double carPrice;
	    
	    public void Car(){
	        
	        carPrice = 0.00;
	        yearOfMake = 1990;
	    }
	    
	    public void setCarMake(String make){
	        
	        this.brand = make;
	    }
	    public String getCarMake(){
	    
	        return brand;
	    }
	    public void setCarModel(String model){
	    
	        this.model = model;
	    }
	    public String getCarModel(){
	    
	        return model;
	    }
	    public void setYeaOfMake(int yearOfMake){
	        
	        this.yearOfMake = yearOfMake;
	    }
	    public int getYearOfMake(){
	    
	        return yearOfMake;
	    }
	    public void setEngineTransmission(String engineTransmissionType){
	    
	        this.engineTransmissionType = engineTransmissionType;
	    }
	    public String getEngineTransmission(){
	    
	        return engineTransmissionType;
	    }
	    public void setFuelType(String fuelType){
	    
	        this.fuelType = fuelType;
	    }
	    public String getFuelType(){
	    
	        return fuelType;
	    }
	    public void setCarColour(String colour){
	    
	        this.colour = colour;
	    }
	    public String getCarColour(){
	    
	        return colour;
	    }
	    public void setCarPrice(double carPrice){
	    
	        this.carPrice = carPrice;
	    }
	    public double getCarPrice(){
	    
	        return carPrice;
	    }
	    public void carProperties(){
	    
	        System.out.println("| Make |"+ brand +"| Model |"
	        + model +"| yearofmake |"+yearOfMake+"| EngineTT |"
	        +engineTransmissionType+"| fuel Type |"
	        + fuelType + "| colour|"+ colour + "| price |R"+ carPrice);
	    }

	    
	    
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    CarConstructor2[] carArray = new CarConstructor2[6];
    for(int carCounter =0;carCounter<6;carCounter++){
         carArray[carCounter] = new CarConstructor2();
    }
        for(int carCounter = 0;carCounter<6;carCounter++){
            
            System.out.println("Enter car make : ");
            carArray[carCounter].setCarMake(input.next());
            System.out.println("Enter car model: ");
            carArray[carCounter].setCarModel(input.next());
            System.out.println("Enter year of make : ");
            carArray[carCounter].setYeaOfMake(input.nextInt());
            System.out.println("Enter the engine transmission type : ");
            carArray[carCounter].setEngineTransmission(input.next());
            System.out.println("Enter fuel type : ");
            carArray[carCounter].setFuelType(input.next());
            System.out.println("Enter the desired colour : ");
            carArray[carCounter].setCarColour(input.next());
            System.out.println("Enter the car price : ");
            carArray[carCounter].setCarPrice(input.nextDouble());
            System.out.println("Enter details for next car ");
            
            
           
        }
    for(int CarCounter=0;CarCounter<6;CarCounter++){
    
        carArray[CarCounter].carProperties();
    }
}
}

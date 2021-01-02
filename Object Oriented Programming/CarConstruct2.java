package oop;

public class CarConstruct2 {
	    private int yearModel;
	    private String make;
	    private int speed;
	     
	    public void Car(){
	    yearModel = 2006;
	    make = "Tiberon";
	    speed = 0;  
	    }
	     
	    //Constructor accepts and initializes the car with data in the main method (default)
	    public void Car(int yearMosel, String m){
	        this.yearModel = yearModel;
	        make = m;
	        speed = 0;
	    }
	     
	    // Accessors (getters)
	    public int getYearModel(){return yearModel;}
	    public String getMake(){return make;}
	    public int getSpeed(){return speed;}
	     
	    //setters (mutators)
	    public void setYearModel(int y){
	        yearModel = y;
	    }
	    public void setMake(String type){
	        make = type;
	    }
	     
	    public void accelerate(){
	        speed += 5;
	        //if (speed >= 0) && (speed <= 210)
	    }
	    public void brake(){
	        speed -= 5;
	    }
	     

}



package oop;

public class Avengers {
	     static String mission, leader, headquarters;
	    static String name;
	    static String origin;
	    static String superpower;
	    static double strength = 100;
	    
	    Avengers( String name, String origin, String superpower, String headquarters){
	    	this.headquarters = headquarters;
	    	this.name = name;
	    	this.origin = origin;
	    	this.superpower = superpower;
	    }

	  /* behavioural methods
	    - jump
	    - fight
	    - flight
	    */
	   
	    public void jumping(double heightOfJump) {
	    	System.out.println("Your character jumped" + heightOfJump + "metres");
	    }
	    
	    public void flight(double heightOfFlight, double speedOfFlight) {
	    	System.out.println(" Your character flew" + heightOfFlight + " metres high at a speed of " + speedOfFlight);
	    }
	    
	    public void fight(int numFight) {
	    	strength = strength - numFight * 10;
	    }
	    
	    static void showDetails(){
	        System.out.println("Avengers Team");
	          System.out.println("Mission:" + mission);
	          System.out.println("By order of:" + leader);
	          System.out.println("Report at:" + headquarters);
	    }
	  
	  public String toString() {
	    return name + " is part of avengers team. Originated with " + origin + " His superpower is " + superpower + " The Misson is to " + mission + " by order of " + " report at";
	  }
	    
	 // writing setter methods
        
	     String setMission(String mission) {
       	 this.mission = mission;
       	 return mission;
        }
	     String setLeader(String leader) {
	    	 this.leader = leader;
	    	 return leader;
	     }
	     
	     String setHeadquarters(String headquarters) {
	    	 this.headquarters = headquarters;
	    	 return headquarters;
	     }
	     String setName(String name) {
	    	 this.name = name;
	    	 return name;
	     }
	     String setOrigin(String origin) {
	    	 this.origin = origin;
	    	 return origin;
	     }
	     String setSuperpower(String superpower) {
	    	 this.superpower = superpower;
	    	 return superpower;
	     }
	     
	     // writing getter methods
	     public String getMission() {
	    	 return mission;
	     }
	     
	     public String getLeader() {
	    	 return leader;
	     }
	     
	     public String getHeadquarters() {
	    	 return headquarters;
	     }
	     
	     public String getName() {
	    	 return name;
	     }
	     
	     public String getOrigin() {
	    	 return origin;
	     }
	     
	     public String getSuperpower() {
	    	 return superpower;
	     }
	     
}

package oop;

public class AvengersMission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    
		      Avengers.showDetails();
		    Avengers hulk = new Avengers("Hulk","Gamma Radiation", "Super Strength", " New York City");
		    hulk.setMission("Save New York City from Aliens");
		    hulk.setLeader(" Nick Fury ");
		    System.out.println(hulk.toString());
		      
		     /* Avengers ironman = new Avengers();
		    ironman.name = " Tony Stark ";
		    ironman.origin = " a powerful suit ";
		    ironman.superpower = " Engineering skills ";
		    ironman.info();
		     
		      Avengers.mission = "Stop Loki from destroying earth";
		      
		      System.out.println("Updated Mission: " + Avengers.mission);
		      ironman.mission = "Break a wall";
		       System.out.println("Hulks Mission: " + hulk.mission);
		       System.out.println("Ironmans Mission: " + ironman.mission);*/
		    
		  }
	}



package oop;

public class Superhero {
	String heroName;
	String realName;
	String powers;
	String backstory;
	String movies;
	String marvelOrDc;

	void details() {
		System.out.println(heroName + "s real name is " + realName + " \nher powers are: " + powers + " \nshe belongs to "
				+ marvelOrDc + "\nher back story is" + backstory + " \nShe has appeared in the following: " + movies);
	}

	void printBackstory() {
		System.out.println(backstory);
	}
}

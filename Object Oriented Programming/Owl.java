package oop;

public class Owl {
// characteristics breed, color, age, height KNOW
	// Behavior hoot, sleep, talk, run, fetch... DOES

	String breed;
	String color;
	int age;
	int height;

	// method
	public void hoot() {
		System.out.println(" Hi! My breed is a " + breed);
	}

	public void sleep() {
		System.out.println("ZZZZZZZ");
	}

	public void talk() {
		System.out.println("hoot");
	}
}

package independentAssignments;

import java.util.Scanner;

public class SchoolSecretaryConstructor {
	public String firstName;
	public String lastName;
	public int gradeYear;
	public String studentID;
	public String courses = " ";
	public int tuitionBalance = 1200;
	public static int costOfCourse = 600;
	public static int id = 1000;

	// Constructor: prompt to enter students name and year
	public SchoolSecretaryConstructor() {
		Scanner userInput = new Scanner(System.in);
		System.out.print(" Enter the students first name: ");
		this.firstName = userInput.nextLine();
		
		System.out.println(" Enter the students last name: ");
		this.lastName = userInput.nextLine();
		
		System.out.println("1) Grade 9\n2) Grade 10\n3) Grade 11\n4) Grade 12\nEnter a number for the students high school year");
		this.gradeYear = Integer.parseInt(userInput.nextLine());
		
		setStudentID();
	}
	
	// generate an ID
	public void setStudentID() {
		// Grade Level + ID
		id++;
		this.studentID = gradeYear + " " + id;  
	}
	// Enroll in Courses
	public void enroll() {
		// Get inside a loop, user hits 0
		do {
		System.out.println(" Enter course to enroll and Q to quit ");
		Scanner userInput = new Scanner(System.in);
		String course = userInput.nextLine();
		if(course.equals("Q")) {
			course = course + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		else {
			break;
		}
	}  while(1 != 0);
	
	}
	
	// View balance
	public void viewBalance() {
		System.out.println(" Your balance is: $ " + tuitionBalance);
	}
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println(" Enter your payment: $ ");
		Scanner userInput = new Scanner(System.in);
		int payment = userInput.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println(" Thank you for your payment of $ " + payment);
		viewBalance();
	}
	
	// Show status
	public String toString() {
		return " Name: "  + firstName + " " + lastName + "\nGrade Level" + gradeYear + "\n Student ID: " + studentID + "\nCourses Enrolled:" + courses + "\nBalance: $ " + tuitionBalance; 
	}
}



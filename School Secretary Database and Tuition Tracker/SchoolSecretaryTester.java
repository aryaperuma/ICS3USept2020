package independentAssignments;

import java.util.Scanner;

public class SchoolSecretaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ask how many new students we want to add
		System.out.println(" Enter number of new students to enroll: ");
		Scanner userInput = new Scanner(System.in);
		int numOfStudents = userInput.nextInt();
		SchoolSecretaryConstructor[] students = new SchoolSecretaryConstructor[numOfStudents];
		
		// Create n number of new students
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new SchoolSecretaryConstructor();
			students[n].enroll();
			students[n].payTuition();
			
		}
		
		for(int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n].toString());
	}

}
}

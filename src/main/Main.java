package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the course scheduler!");
		// log in
		System.out.println("Log in as:\n[1] student\n[2] professor\n[3] admin");
		
		// read input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = scanner.nextInt();
		
		// jump
		if(number == 1) {    // student
			Display(scanner);
			
			// create a Student object(builder pattern)
			
			// student functions
			System.out.println("\n[1] view all classes\n[2] view my class schedule\n"
					+ "[3] enroll in classes\n[4] drop classes\n[5] exit\n");
			System.out.println("Please enter a number: ");
			int number1 = scanner.nextInt();
			
		}
		
		if(number == 2) {    // professor
			Display(scanner);
			
			// create a Professor object
		}
		
		if(number == 3) {    // admin
			Display(scanner);
			
			// create an Admin object 
		}
		
		
		scanner.close();
	}
	
	public static void Display(Scanner scanner) {
		
		System.out.println("Please enter your first name: ");
		String name = scanner.next();
		System.out.println("Hi " + name + ", you are logged in successfully!");
		
	}
	public int target() {
		return 1;
	}
	
}

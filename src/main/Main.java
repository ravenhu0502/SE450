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
			System.out.println("Please enter your first name: ");
			String name = scanner.next();
			System.out.println("Hi " + name + ", you are logged in successfully!");
		}
		
		
		
		scanner.close();
	}
	
	public int target() {
		return 1;
	}
	
}

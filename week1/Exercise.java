
//1. Write a program that ask the user for their name and prints a welcome message
//also ask the user for their age and subtract their age from the current year
//print the result as the birth year 
import java.util.Scanner;

public class Exercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//input
		System.out.println("Hello, what is your name?");
		String name = sc.nextLine();//Waits for the user to enter their name
		
		System.out.println("Hello, "+name+", How old are you?");
		int age = sc.nextInt(); // waits for the user to enter age
		
		//process
		int birthYear = 2021 - age;
		
		//output
		System.out.println("Your Birth Year " + birthYear );

		
	}
}

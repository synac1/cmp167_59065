/*
 * Write a program that simulates a liquor store

//Requirements, Welcomes user, asks the user for their age
//Then compares the age, if the user is below 21 prints out a message to the console
// that the store can't sell him alcohol, if the user is 21 or over, prints a message 
// saying the user can buy alcohol
 
  Be creative
 * 
 * */
import java.util.Scanner;
public class LiquorStore {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Welcome to Jerry's Liquor's Store");
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if ( age >= 21 ) {
			System.out.println("Awesome, what would you like to get?");
			//Create 
			String input = sc.next();
			System.out.println("The " + input + " is $20.00");
			System.out.println("Enter payment:");
			double payment = sc.nextDouble();
			if (payment >= 20.00) {
				System.out.println("Here you have "+input);
			}else {
				System.out.println("Not enough money");
			}
		}
		else if (age < 21) {
			System.out.println("You are underage, I cannot sell alcohol to you");
		}else {
			System.out.println("Not reachable");
		}
		
		
	}
}

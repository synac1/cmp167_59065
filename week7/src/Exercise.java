/*
 	Write four methods
 	1- First method will be an input method. it has an empty parameter list, it will ask the user for their age 
 	and return it 
 	2 - Second method will be another input method. It takes a String argument (as prompt messesage), and it will prompt 
 	the user for their name using the prompt 
 	
 	3- A  method that will take the age as argument and it will return the year the user is born
 	
 	4- A method that calculates the numerical value of a given string, and return the numerical value
 */
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class Exercise {
	static Scanner input = new Scanner (System.in);
	
	public static int getAge () {
		System.out.println("Enter age: ");
		return input.nextInt();  //returns the int value that was grabbed from the user
	}
	//input method
	public static String getName (String  message) {
		System.out.println(message);
		return input.next();
	}
	
	public static int calculateBirthYear(int age) {
		Date  date = new Date();
		int currentYear = date.getYear();
		return currentYear-age;
	}
	
	public static int numericalValue (String word) {
		int sum = 0;
		for (int i = 0; i < word.length() ; i++ ) {
			sum += word.charAt(i);
		}
		return sum;
	}
	
}

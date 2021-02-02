/**
 * 
 * @author Yani
 *
 */

import java.util.Scanner;
public class Greeting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating a scanner object
		System.out.print("Enter name: "); //prompting for a name
		String name = sc.nextLine(); //waits for the user to enter an input
		System.out.println("Hello, " + name); //concatenate name with hello and ouptput
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Subtract 5:" + (age -5));
	}
}

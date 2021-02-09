import java.util.Scanner;

/**
 * 
 * @author Yanilda
 * 
 */

public class BankStatement {
	public static void main(String[] args) {
		System.out.println("Welcome to Bank3000");
		Scanner sc = new Scanner(System.in);
		
		double balance;
		double withdraw;
		double deposit;
		
		balance = 100.00;
		System.out.println("Your balance is "+ balance);
		
		System.out.println("Enter deposit");
		deposit = sc.nextDouble(); // waits  for users input and store into the variable
		
		balance = balance + deposit ;
		System.out.println("Your balance is "+ balance);
		
		System.out.println("Enter withdrawal");
		withdraw =  sc.nextDouble();
		
		balance = balance - withdraw ;
		System.out.println("Your balance is "+ balance);
		
		// %d integers
		// %f floating points
		// %c char
		// %s String
		System.out.printf("I have %d items %n",  200 );
		System.out.printf("My balance is $ %.2f total ", balance );
		
		
	}
}

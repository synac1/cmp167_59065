import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Write a login program, that keeps asking the user user for username and password, and after certain amount of
 * failed attempts the account gets locked out  
 */
public class Exercise5 {
	public static void main(String[] args) throws FileNotFoundException{
	
		
		File credentials = new File("C:\\Users\\yanil_jjrab3j\\Documents\\teaching\\spring2021\\CMP167_59065\\week5\\src\\credentials.txt.txt");
		Scanner inputFile = new Scanner(credentials);
		
		Scanner sc = new Scanner(System.in);
		
		String user = inputFile.next();
		String pasword = inputFile.next();
		

		int n = 5;
		int i;
		for( i = 0; i < n; i++) {
			System.out.println("Enter username:");
			String userName = sc.next();

			System.out.println("Enter password: ");
			String userInput = sc.next();


			if( userInput.equals(pasword) && userName.equals(user)  ) {
				
				System.out.println("Welcome!");
				break;
				
			} else {
				
				System.out.println("Wrong username or password");
			}
		}

		if(i == n) {
			System.out.println("Your account has been locked out");
		}

	}
}

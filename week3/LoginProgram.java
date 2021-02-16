/**
 * 
 * @author Yanilda
 *
 */
import java.util.Scanner;
public class LoginProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = "admin";
		String pwd  =  "password";
		
		String userInput;
		String passInput;
		
		System.out.print("Enter Username:");
		userInput = sc.next();
		
		System.out.print("Enter pasword:");
		passInput = sc.next();
		
		if (userInput.equals(user)) {
			if(passInput.equals(pwd)) {
				System.out.println("Login successful");
			}
		}else {
			System.out.println("Access Denied");
		}
		
		
		
	}
}

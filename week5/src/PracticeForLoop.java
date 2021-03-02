import java.util.Scanner;

public class PracticeForLoop {
	public static void main(String[] args) {

		int n = 5;
		
		/*
		 * double sum = 0.0;
		 * 
		 * for(int i = 1 ; i <= n ; i++ ) {  sum += i; }
		 * 
		 * System.out.println("Sum is "+ sum); System.out.println("Average "+ (sum/n));
		 * 
		 * for(int i = 100 ; i <= 600 ; i += 50 ) { //infinite loop
		 * System.out.println(i); /// printing i }
		 */
		
		String pasword = "1234";
		Scanner sc = new Scanner(System.in);
		int i;
		for( i = 0; i < n; i++) {
			
			System.out.println("Enter password: ");
			String userInput = sc.next();
			
			if(userInput.equals(pasword)) {
				System.out.println("Welcome!");
				break;
			}else {
				System.out.println("Wrong password");
			}
			
		}
		if(i == 5) {
			System.out.println("Your account has been locked out");
		}


	}
}

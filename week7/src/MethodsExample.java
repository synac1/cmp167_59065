
/**
 * 
 * @author Yanilda
 *
 **/

import java.util.Scanner; 

public class MethodsExample {
	public static int sumOfTwo( int a, int b){
		return a + b ;
	}
	
	public static void printGreeting () {
		System.out.println("Hello, welcome");
	}
	
	//input method
	public static String getName(String prompt) {
		System.out.println(prompt);
		
		Scanner in = new Scanner(System.in);
		String name  =  in.next();
		
		System.out.println("Thank you " + name);
		return name;
	}
	//Output method
	public static void complimentHuman(String name) {
		System.out.println(name + " is Aweseome");
	}
	
	
	
}


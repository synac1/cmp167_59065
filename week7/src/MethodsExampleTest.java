

public class MethodsExampleTest {
	public static void main(String[] args) {
		
		/*
		 * int result = MethodsExample.sumOfTwo(10, 11); //This method is returning a
		 * value and this has to be stored
		 * 
		 * MethodsExample.printGreeting(); // this method call is not returning a value
		 * 
		 * System.out.println("Result "+result); System.out.println("Result "+ (result +
		 * 5)); System.out.println("Result "+result);
		 * System.out.println("___________________________________");
		 * 
		 * int value = Program.sumN2M(1, 3);
		 * 
		 * System.out.println(value);
		 * 
		 * 
		 * System.out.println("___________________________________"); String
		 * promptMessage = "Enter your name: "; String name =
		 * MethodsExample.getName(promptMessage);
		 * 
		 * 
		 * System.out.println("___________________________________");
		 * MethodsExample.complimentHuman(name);
		 * 
		 * 
		 * String word = "Butterfly"; System.out.println(word.charAt(0)+word.charAt(1));
		 * 
		 * for (int i = 0; i < word.length() ; i++) {
		 * System.out.println(word.charAt(i)); }
		 */
		int age = Exercise.getAge();
		String name  = Exercise.getName("Enter a name:");
		int bY = Exercise.calculateBirthYear(age);
		int numVal= Exercise.numericalValue(name);
		
		System.out.printf("Thank you, %s. Your birthYear could be %d "
				+ "and\nthe numerical value of your name is %d", name, bY, numVal);
	}	
}

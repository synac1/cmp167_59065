/*
  Write a method that takes in two int arguments n and m 
  and returns the sum from n to m
  
 */
public class Program {
	
	public static int sumN2M(int n , int m) {
		int sum = 0 ;
		
		for (int i = n ; i <= m; i++ ) {
			sum +=i;
		}
		
		return sum;
	}

}

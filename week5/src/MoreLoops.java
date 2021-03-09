
public class MoreLoops {
	public static void main(String[] args) {
		int n = 10;

		/*		//Printing all the numbers from 1 to n
		for(int i = 1; i <= n; i++ ) {
			System.out.println(i);
		}
		 */	


		/*
		 * int a = 4; 
		 * int b = a ++; // assigning the value of a to b  before changing the value of a 
		 * 
		 * System.out.println("a :"+a); // 5
		 * 
		 * System.out.println("b :"+b); // 4
		 * 
		 * int c = ++ b; // incrementing before assigning
		 * 
		 * System.out.println("a :"+a); // 5
		 * 
		 * System.out.println("b :"+b); // 5
		 * 
		 * System.out.println("c :"+c); // 5
		 * 
		 */

/*
		for( int i = 1; i <= n ; i++ ) { // rows 
			for (int j = 1 ; j <= n ; j++ ) {//columns 2*1 2*2 2*3 ... 2 * 10 
				System.out.print(i*j +"\t");
			}
			System.out.println();
		}
	*/
	
		for( int i = 1; i <= n ; i++ ) { // rows 
			
			for (int j = 1 ; j <= i ; j++ ) {//columns
				
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}

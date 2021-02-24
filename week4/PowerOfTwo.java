// Write a program to calculate the powers of 2 of the first 10 powers of two
// 1 2 4 8 16 32.. 
public class PowerOfTwo {
	public static void main(String[] args) {
		int cpt = 0;
		int num = 1;
		int limit = 10;
		
		while( cpt < limit) {
			System.out.println(num);
			num = num * 2;
			cpt = cpt + 1;
		}

	}
}

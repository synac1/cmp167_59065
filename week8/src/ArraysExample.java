import java.util.Arrays;
import java.util.Iterator;

public class ArraysExample {
	public static void main(String[] args) {
		int [] nums = new int [100];
		System.out.println(nums[50]);
		nums[50] = 189;
		System.out.println(nums[50]);
		
		double [] numsD = {2.5, 2.7, 2.8};
		
		System.out.println(numsD[1]);
		
		for (int i = 0; i < numsD.length; i++) {
			System.out.print(numsD[i]+" ");
		}
		System.out.println();
		for (double d : numsD) {
			System.out.print(d +" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(numsD));
		
		char []  myLetters = {'J', 'a', 'z', 'z'};
		
		String music = new String(myLetters);
		
		System.out.println(music);
	}
	public static char[] getChars (String word) {
		
		char [] letters = new char [word.length()];
		for(int i =0; i< word.length(); i++) {
			letters[i] = word.charAt(i);
		}
		return letters;
	}
}

import java.util.Arrays;

// Write a method that takes in an int array as argument and
//returns a new int array with the elements of given array multiplied by 5. 
public class Exercise {
	public static int[] multBy5(int []  arr) {
		int []  nArr = new int[arr.length]; //creating a new int array  with same length as original array 
	
		for (int i = 0; i < nArr.length ; i++ )
			nArr[i]  =  arr[i] *5 ;
	
		return nArr;
	}
	
	public static void main(String[] args) {
		
		int [] myArr = new int[] {5, 3, 6};
		int [] myArr2 = multBy5(myArr);

		String myArrString = Arrays.toString(myArr2); 
		System.out.println( myArrString);
	}
}

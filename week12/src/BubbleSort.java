import java.util.Arrays;

public class BubbleSort {
	public static void sort(int []  arr) {
		for(int i = 0 ; i < arr.length ; i++)
			for (int j = 0; j<arr.length-1-i; j++) {
				if (arr[j]>arr[j+1]) {
					int old = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = old;
				}
			}
	}
	public static void main(String[] args) {
		int [] numbers = {3, 2, 5, 6, 0, 7};
		System.out.println(Arrays.toString(numbers));
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		int [] numbers1 = {1, 2, 3, 4, 0};
		System.out.println(Arrays.toString(numbers1));
		sort(numbers1);
		System.out.println(Arrays.toString(numbers1));
		
	}
}

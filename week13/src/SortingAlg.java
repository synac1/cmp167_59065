import java.util.Arrays;

public class SortingAlg {
	static void merge( int [] arr, int leftStart, int middle, int rightEnd){

		int i, j, k;
		int []  left  = new int[middle - leftStart +1];
		int []  right = new int[rightEnd - middle];

		for (i = 0; i<left.length ; i++)
			left[i] = arr[leftStart+i];
		for (j = 0 ; j < right.length; j++)
			right[j] = arr[middle + 1 + j];

		i = 0;
		j = 0;
		k = leftStart;

		while (i < left.length && j < right.length ){
			if (left[i] <= right[j]){
				arr[k] = left[i];
				i++;
			}
			else{
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while(i < left.length){
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < right.length){
			arr[k] = right[j];
			j++;
			k++;
		}	 
	}


	static void merSort( int [] arr){
		int n = arr.length;
		int arr_size;
		int left;

		for( arr_size =1 ; arr_size <n ; arr_size = 2*arr_size ){
			for (left = 0; left < n-1 ; left += 2*arr_size ){
				
				int mid  = Math.min(left+arr_size-1 , n -1);
				int right = Math.min(left + 2*arr_size-1, n-1);
				merge(arr, left, mid, right);
			}
		}


	}
	public static void main(String[] args) {
		int [] arr = {3, 2, 1, 6, 8, 7};
		System.out.println(Arrays.toString(arr));
		merSort(arr);
		System.out.println(Arrays.toString(arr));
		
		// Swapped 
		arr[0] = arr[0] + arr[1];
		arr[1] = arr[0] - arr[1];
		arr[0] = arr[0] - arr[1];
		System.out.println(Arrays.toString(arr));
		
		// Exercise for week 13, to research about the Binary Search 
		
		
		
	}
}

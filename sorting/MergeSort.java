import java.util.*;

public class MergeSort {
	
	public static void main(String[] args) {
		
		int[] numbers = {56,87,90,0,-1,28,5,1,7,4};
		mergeSort( numbers, 0, numbers.length -1 );
		System.out.println( Arrays.toString(numbers));
		
	}

	// complexity O(nlogn)
	public static void mergeSort( int[] numbers, int low, int high ){
		if( low >= high)
			return;

		// base case
		int mid = ( low + high )/2;

		mergeSort( numbers, low, mid );
		mergeSort( numbers, mid +1, high);
		merge( numbers, low, mid,  high );
	}

	private static void merge( int[] numbers, int low,int mid,int high){

		List<Integer> temp = new ArrayList<>();

		int left = low;
		int right = mid +1;

		while( left <= mid && right <= high){

			if( numbers[left] <= numbers[right] ){
				temp.add(  numbers[left]);
				left++;
			}
			else {
				temp.add( numbers[right]);
				right++;
			}
		}
		// if element exist in first half
		while( left <= mid ){
			temp.add(  numbers[left]);
			left++;
		}
		// if element exist in first half
		while( right <= high ){
			temp.add(  numbers[right]);
			right++;
		}

		for (int i = low; i<= high ;i++ ) {
			numbers[i] = temp.get(i-low);
		}
	}
}
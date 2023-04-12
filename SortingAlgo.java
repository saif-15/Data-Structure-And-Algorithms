import java.util.*;

public class SortingAlgo {
	
	public static void main(String[] args) {
		
		int[] numbers = {56,87,90,0,-1,28,5,1,7,4};
		mergeSort( numbers, 0, numbers.length -1 );
		System.out.println( Arrays.toString(numbers));
		
	}

	// complexity O N^2
	public static void selectionSort( int[] numbers ){
		int n = numbers.length;
		for (int i=0;i< n-1 ;i++ ) {
		
			int minIndex = i;
			for (int j=i;j<n;j++ ) {
				if( numbers[j] < numbers[minIndex]){
					minIndex=j;
				}
			}
			// swap
			int temp = numbers[minIndex];
			numbers[minIndex] = numbers[i];
			numbers[i]= temp;
		}
	}
	// complexity O N^2
	public static void bubbleSort( int[] numbers ){

		int n = numbers.length;
		for (int i = n-1 ; i >= 1; i-- ) {
			for (int j=0; j<i; j++) {
				if( numbers[j] > numbers[j+1]){
					// swap
					int temp = numbers[j+1];
					numbers[j+1] = numbers[j];
					numbers[j]= temp;
				}
			}
		}
	}
	//complexity O n^2
	public static void insertionSort( int[] numbers ){
		int n = numbers.length;
		for (int i =0 ;i<n ;i++ ) {
			int j =i;
			while ( j>0 && numbers[j] < numbers[j-1]) {
				// swap
				int temp = numbers[j-1];
				numbers[j-1] = numbers[j];
				numbers[j]= temp;
				j--;
			}
		}
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

		List<Integer> temp = new ArrayList();

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
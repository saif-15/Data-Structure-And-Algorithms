import java.util.*;

public class SortingAlgo {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[]{56,87,90,0,-1,28,5,1,7,4};
		insertionSort( numbers );
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
}
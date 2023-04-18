import java.util.*;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] numbers = {56,87,90,0,-1,28,5,1,7,4};
		insertionSort( numbers );
		System.out.println( Arrays.toString(numbers));
		
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
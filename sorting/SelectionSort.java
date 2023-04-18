import java.util.*;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		int[] numbers = {56,87,90,0,-1,28,5,1,7,4};
		selectionSort( numbers );
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
}
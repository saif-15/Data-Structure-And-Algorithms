import java.util.*;

public class SortingAlgo {
	
	public static void main(String[] args) {
		
		int[] numbers = {56,87,90,0,-1,28,5,1,7,4};
		bubbleSort( numbers );
		System.out.println( Arrays.toString(numbers));
		
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

}
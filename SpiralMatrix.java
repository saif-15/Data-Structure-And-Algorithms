import java.util.*;
public class SpiralMatrix{
	public static void main(String[] args) {
		
		// 6x6 matrix
		int[][] matrix = {{1, 2, 3, 4, 5, 6},
						  {20,21,22,23,24,7},
						  {19,32,33,34,25,8},
						  {18,31,36,35,26,9},
						  {17,30,29,28,27,10},
						  {16,15,14,13,12,11}};
		List<Integer> numbers = new ArrayList<Integer>();
		printSpiral( matrix , numbers);
		System.out.println( numbers);
	}

	public static void printSpiral( int[][] matrix ,List<Integer> numbers){

		// number of rows
		int n = matrix.length;
		// number of colums
		int m = matrix[0].length;

		int top = 0;
		int left = 0;
		int right = m - 1;
		int bottom = n - 1;

		while( top<= bottom && left <= right ){


			for (int i = left; i<= right ; i++ ) {
				numbers.add( matrix[top][i] );
			}
			top++;

			for (int i = top; i<= bottom ; i++ ) {
				numbers.add( matrix[i][right] );
			}
			right--;

			if( left <= right ){
				for (int i = right; i>= left ; i-- ) {
				numbers.add( matrix[bottom][i] );
				}
				bottom--;
			}
			
			if( top <= bottom ){
				for (int i = bottom; i>= top ; i-- ) {
				numbers.add( matrix[i][left] );
				}
				left++;
			}
		}
	}
}
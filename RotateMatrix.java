public class RotateMatrix{

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

		int[][] result = rotateMatrix( matrix );
		printMatrix( result);
		System.out.println();
		transpose( matrix );
		reverseRows( matrix );
		printMatrix( matrix );

	}

	// rotate by using transpose
	// complexity O(n^2)
	// space O(1) not using any new matrix
	public static void transpose( int[][] matrix){
		int n = matrix.length;
		for (int i = 0; i < n ; i++ ) {
			for (int j=i + 1; j< n ; j++ ) {
				int temp = matrix[i][j];
				matrix[i][j] =  matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public  static void reverseRows( int[][] matrix ){
		for (int i = 0; i< matrix.length ; i++ ) {
		
			int start = 0;
			int end = matrix[i].length - 1;
			while( start < end ){
				int temp = matrix[i][ start ];
				matrix[i][ start ] = matrix[i][ end ];
				matrix[i][ end ] = temp;
				start ++;
				end--;
			}
		}

	}

	// rotate by using new matrix
	// complexity O(n^2)
	// space complexity O(n^2)
	public static int[][] rotateMatrix( int[][] matrix ){
		int n = matrix.length;
		int[][] result = new int[n][n];

		for (int i=0;i<matrix.length;i++ ) {
			for (int j = 0; j <matrix[0].length ; j++ ) {
				result[j][n-i-1] = matrix[i][j];
			}
		}
		return result;
	}


	// print matrix
	public static void printMatrix( int[][] matrix ){

		for (int i=0;i<matrix.length;i++ ) {
			for (int j = 0; j <matrix[0].length ; j++ ) {
				System.out.print( matrix[i][j] + " " );
			}
			System.out.println();
		}
	}	
}
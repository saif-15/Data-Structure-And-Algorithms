import java.util.*;
public class BasicRecursion{

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,4,32,1,3,5,1,2,3,1};
//		System.out.println( Arrays.toString( nums));
		printNumbers(10);
//		System.out.println( Arrays.toString( nums));
	}

	// print something n times
	public static void print( int time ){
		if( time == 0){
			return;
		}
		System.out.println( "Saif" );
		print(--time);
	}

	// print 1 to n numbers
	public static void printNumbers( int number ){
		if( number == 0){
			return;
		}
		printNumbers( number - 1 );
		System.out.println( number);
	}

	// sum of n numbers
	public static int sum( int number ){
		if( number == 0)
			return number;

		return number + sum( number - 1 );
	}

	// factorial
	public static int factorial( int number ){
		if( number == 1)
			return number;

		return number * factorial( number -1);
	}

	// reverse an array
	public static void reverseArray( int[] number, int start, int end ){
		if( start >= end )
			return ;

		// swap
		int temp = number[start];
		number[start] = number[end];
		number[end] = temp;
		reverseArray( number , start+1, end-1);
	}

	// check palidrome
	public static boolean isPalidrome( String str,int start, int end){
		if( start >= end )
			return true;
		if( str.charAt(start) != str.charAt( end )){
			return false;
		}
		return isPalidrome( str, start + 1, end -1);
	}
}
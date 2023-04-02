public class MathBasics{
	
	public static void main(String[] args) {
		
		System.out.println( reverse(1911212219));
	
	}

	// complexity O( log(n) )
	// divide approach 
	public static int count( int number ){
		int count = 1;
		// extract digit
		while ( number > 0  ) {
			count++ ;
			number /= 10;
		}
		return count;
	}

	// complexity O( 1 )
	// log approach 
	public static int countByLog( int number ){
		
		if( number <= 0) return 0;
		int count =  (int)Math.log10( number ) +1;
		return count;
	}

	// complexity O(log n)
	public static int reverse( int number ){

		int reversed = 0;
		while( number != 0){

			int digit = number % 10;
			if( reversed > Integer.MAX_VALUE ||  reversed < Integer.MIN_VALUE){
				return 0;
			}
			reversed = (reversed * 10) + digit;
			number /= 10;
		}
		return reversed;
	}

	// complexity O(log(n))
	public static boolean palid( int number ){
		if( number < 0) return false;
		int reversed = 0;
		int duplicate = number;
		while( number > 0){

			int digit = number % 10;
			number /= 10;
			reversed = (reversed * 10) + digit;
		}
		return reversed == duplicate;
	}
}
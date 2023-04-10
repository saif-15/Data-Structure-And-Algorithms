public class MathBasics{
	
	public static void main(String[] args) {
		
		//System.out.println(checkPrime(7));
		printDivisors(7);
	
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

	// gcd of the number

	public static int gcd( int a , int b){

		while( a > 0 && b> 0){
			if( a> b){
				a =a%b;
			}else{
				b = b%a;
			}
		}
		if( a== 0 )
			return b;
		return a;
	}

	// Armstrong numbers
	// 3 7 1 cube to inidiviusal number sum to this number
	public static boolean isArmstrongNumber( int number ){

		int ans = 0;
		int numberCopy = number;
		while( number != 0 ){
			int digit = number % 10;
			ans += (digit*digit*digit);
			number /= 10;
		}
		return numberCopy == ans;
	}

	// print all divisors
	public static void printDivisors( int number ){
		int count = 0;
		for (int i = 1;i*i <= number ; i++ ) {
			if( number % i == 0){
				System.out.println( i );
				int n = number/i;
				if( n != i){
					System.out.println(n);
				}
			}
			count++;
		}
		System.out.println(count);
	}

	// check for prime
	// number have only two factors a 1 and itself
	public static boolean checkPrime( int number ){
		int count = 0;
		for (int i = 1;i*i <= number ; i++ ) {
			if( number % i == 0){
				count++;
				int n = number/i;
				if( n != i){
					count++;
				}
			}
		}
		return count == 2;
	}
}
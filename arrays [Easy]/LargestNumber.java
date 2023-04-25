import java.util.*;

public class LargestNumber{
	public static void main(String[] args) {
		

		int[] nums = {1,6,3,12,6,-1,2,5,8,1,7};
		System.out.println( largestNumber( nums, 1));
		System.out.println( secondLargestNumber(nums, 1) );

	}


	// O nlog(n) solution
	public static int largestNumber( int[] nums , int e){
		// sort the the array
		Arrays.sort( nums );
		return nums[ nums.length -1 ];
	}

	// O (n) solution
	public static int largestNumber( int[] nums ){

		int largest = nums[0];
		for (int i =1;i< nums.length ;i++ ) {
			if( nums[i] > largest ){
				largest = nums[i];
			}
		}
		return largest;
	}

	// nlogn solution
	public static int secondLargestNumber( int[] nums ){

		Arrays.sort( nums );
		int slargestNumber = Integer.MIN_VALUE;
		int largest = nums[ nums.length -1];
		for (int i= nums.length - 2; i >=0 ; i-- ) {
			
			if( nums[i] != largest ){
				slargestNumber = nums[i];
				break;
			}
		}
		return slargestNumber;
	}

	// O n solution
	public static int secondLargestNumber( int[] nums , int k){
		int slargestNumber = Integer.MIN_VALUE;
		int largest = nums[ 0 ];
		for (int i=0; i< nums.length ; i++ ) {
			
			if( nums[i]> largest ){
				slargestNumber = largest;
				largest = nums[i];
			}
			else if( nums[ i ] < largest && nums[i] > slargestNumber){
				slargestNumber = nums[i];
			}
		}
		return slargestNumber;
	}
}
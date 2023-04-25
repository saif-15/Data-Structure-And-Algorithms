import java.util.*;
public class RotateArray{

	public static void main(String[] args) {
	
		int[] nums = {1,2,3,4,5};
		System.out.println( Arrays.toString( nums ));
		rotateArrayByN( nums, 3 );
		System.out.println( Arrays.toString( nums ));
	}

	// rotate left by one O n solution
	public static void rotateLeftByOne( int[] nums ){

		int temp = nums[0];
		for (int i=1;i< nums.length ;i++ ) {
			nums[i-1] = nums[i];
		}
		nums[ nums.length - 1] = temp;
	}

	// rotate left by k On^2 solution
	public static void rotateLeftByK( int[] nums, int k ){

		k = k%nums.length;

		for (int j = 1; j<= k ; j++ ) {
			int temp = nums[0];
			for (int i=1;i< nums.length ;i++ ) {
				nums[i-1] = nums[i];
			}
			nums[ nums.length - 1] = temp;	
		}
	}

	// rotate 0 - k in O(n) and O(n) space
	public static int[] rotateArrayN( int[] nums , int k){
		int n = nums.length;
		k = k%n;
		int[] result = new int[n];
		for (int i=0;i< n ; i++ ) {
			result[(k+i)%n] = nums[i];
		}
		return result;
	}
	// helper function to rotate left using right rotation
	// as LR(2) == RR(n-2)
	public static int[] rotateArray( int[] nums, int d){
		return rotateArrayN( nums, nums.length - d );
	}


	// rotate array using k size temp array
	public static void rotateArrayZ( int[] nums, int k){

		int n = nums.length;
		k =k%n;
		int[] temp = new int[k];

		// populate temp array
		for (int i =0; i<k ; i++ ) {
			temp[i] = nums[i];
		}
		// shift remaing elements
		for (int j = k; j<n ;j++ ) {
			nums[j-k] = nums[j];
		}
		// add temp to original array
		for( int i = n-k ; i < n;i++ ){

			nums[i] = temp[i-(n-k)];
		}
	}

	public static void rotateArrayByN( int[] nums , int k ){
		int n = nums.length;
		k = k%n;
		reverse(nums, 0 , k-1);
		reverse( nums, k, n-1);
		reverse( nums, 0 ,n-1);
	}

	public static void reverse( int[] nums, int start, int end){

		while( start < end ){
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
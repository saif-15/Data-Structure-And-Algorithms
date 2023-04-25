public class CheckSorted{

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,5};
		int[] nums1 ={2,5,4,5,6};
		System.out.println( checkSorted(nums1));
	}

	public static boolean checkSorted( int[] nums ){

		if( nums.length == 1){
			return true;
		}
		for (int i = 1 ; i< nums.length ; i++) {
			if( nums[i] < nums[i-1])
				return false;
		}
		return true;
	}
}
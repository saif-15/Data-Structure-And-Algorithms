public class SingleNumber{

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4,2,3,4};
		System.out.println( singleNumber( nums ) );
	}

	// best solution
  	public static int singleNumber(int[] nums) {
        
        int result = 0;
        for( int i =0 ; i< nums.length ; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}

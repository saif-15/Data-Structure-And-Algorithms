import java.util.*;

public class RemoveDuplicateFromSortedArray{

	public static void main(String[] args) {
		
		int[] nums={1,1,1,2,3,3,4,5};
		System.out.println(Arrays.toString( nums ));
		System.out.println(removeDuplicates( nums , 1));
		System.out.println(Arrays.toString( nums ));
	}


	// O N solution without using set
	public static int removeDuplicates( int [] nums , int q){

		int i = 0;
		for (int j= 1; j <nums.length ; j++ ) {
			if( nums[j] >  nums[i]){
				nums[i+1] = nums[j];
				i++;
			}
		}
		return i+1;
	}



	// using xtra space and nlogn solution
	public static int removeDuplicates( int [] nums ){

		Set<Integer> set = new HashSet<>();
		for (int i =0;i< nums.length ; i++ ) {
			set.add( nums[i] );
		}
		// set contains distinct elements only

		int j = 0;
		for (Integer num : set) {
			nums[j] = num ;
			j++;	
		}

		return set.size();
	}
}
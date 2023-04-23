import java.util.*;
public class QuickSort{

	public static void main(String[] args) {
		
		int[] nums = {4,5,1,7,8,2,3,9,6};
		System.out.println( Arrays.toString( nums ));
		quickSort( nums, 0, nums.length - 1 );
		System.out.println( Arrays.toString( nums ));
		
	}

	public static void quickSort( int[] nums , int start , int end){

		if( start < end ){
			int partitionIndex = partition( nums, start, end);
			quickSort( nums, start, partitionIndex - 1);
			quickSort( nums, partitionIndex + 1, end ); 
		}
	}

	public static int partition( int[] nums, int start, int end ){
		// pivot
		int pivot = nums[start];
		int i = start;
		int j = end;

		while( i< j){
			while( nums[i] <= pivot && i <= end ){
				i++;
			}
			while( nums[j] > pivot && j >= start ){
				j--;
			}
			if( i < j ){
				int temp = nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
			}
		}
		int temp = nums[start];
		nums[start] = nums[j];
		nums[j] = temp;
		return j;
	}
}
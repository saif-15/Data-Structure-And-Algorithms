import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5};

        System.out.println(Arrays.toString( numbers));
        rotateClockWise( numbers , 2);
        System.out.println(Arrays.toString( numbers));
        rotateAntiClockWise( numbers , 2);
        System.out.println(Arrays.toString( numbers));


    }

    public static void rotateClockWise( int[] numbers , int k){
        int n = numbers.length;
        k = k%n;
        // reverse  0 to n-k-1
        reverse( numbers, 0,n-k-1);
        // reverse n-k to n-1
        reverse( numbers, n-k, n-1);
        // reverse 0 to n-1
        reverse( numbers,0,n-1);
    }


    public static void rotateAntiClockWise( int[] numbers , int k){
        int n = numbers.length;
        k = k%n;
        // reverse 0 to n-1
        reverse( numbers,0,n-1);
        // reverse  0 to n-k-1
        reverse( numbers, 0,n-k-1);
        // reverse n-k to n-1
        reverse( numbers, n-k, n-1);

    }

    public static void reverse( int[] numbers , int start , int end){
            while ( start < end ){
                // swap
                int temp = numbers[ start ];
                numbers[start] = numbers[end];
                numbers[end] = temp;
                start++;
                end--;
        }
    }
}

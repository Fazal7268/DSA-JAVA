import java.util.*;
class Solutions {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for(int i = n-1; i>=0 ; i--){
            boolean digswap= false;
            for(int j = 0 ; j<=i-1 ; j++){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    digswap = true;
                }
            }if(!digswap){
                break;
            }
        } return nums;
    }
}
public class Bubble_Sort {
public static void main(String[] args) {
    // Create an instance of solution class
    Solutions solution = new Solutions();

    int[] nums = {7, 4, 1, 5, 3};

    System.out.println("Array Before Using Bubble Sort: " + Arrays.toString(nums));

    // Function call for Bubble Sort
    nums = solution.bubbleSort(nums);

    System.out.println("Array After Using Bubble Sort: " + Arrays.toString(nums));
}
}

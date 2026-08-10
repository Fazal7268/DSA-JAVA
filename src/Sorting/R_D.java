import java.util.*;
class A1 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1 ; j< nums.length ; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }return i+1;
    }
}

public class R_D {
    public static void printArray(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 3};

        System.out.print("Original Array: ");
        printArray(nums, nums.length);

        // Create an instance of the Solution class
       A1 sol = new A1();

        // Function call to remove duplicates from array
        int k = sol.removeDuplicates(nums);

        System.out.print("Array after removing the duplicates: ");
        printArray(nums, k);
    }

}

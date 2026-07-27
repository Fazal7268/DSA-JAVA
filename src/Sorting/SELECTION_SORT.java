import java.util.*;
class Solution {
    public int[] selectionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0 ; i<n-1 ; i++){
            int min = i;
            for(int j = i ; j < n ; j++){
                if(nums[j]<nums[min]){
                    min = j;
                }
            }
            if (min != i) {
                int temp = nums[i];
                nums[i] = nums[min];
                nums[min]=temp;
            }}return nums;
    }
}
public class SELECTION_SORT {

    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 2, 8};

        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // create an instance of solution class
        Solution solution = new Solution();

        // function call for selection sort
        int[] sortedArr = solution.selectionSort(arr);

        System.out.print("Sorted array: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
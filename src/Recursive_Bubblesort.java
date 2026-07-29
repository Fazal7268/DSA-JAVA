class Solution1 {
    public int[] bubbleSort(int[] nums) {
        bubble(nums,nums.length);
        return nums;
    }
    public void bubble(int[] nums , int n){
        if(n<=1){
            return;
        }
        for(int i = 0 ; i < n-1 ; i++){
            if (nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }
        bubble(nums , n-1);

    }}
public class Recursive_Bubblesort {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        int[] nums = {5, 2, 9, 1, 5, 6};  // Example input array

        // Output the sorted result
        int[] sortedArray = sol.bubbleSort(nums);
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


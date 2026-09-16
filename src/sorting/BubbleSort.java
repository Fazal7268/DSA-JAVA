package sorting;

import java.util.Arrays;

class BubbleSortSolution {
    public int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = n - 1; i >= 0; i--) {
            boolean didSwap = false;
            for (int j = 0; j <= i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    didSwap = true;
                }
            }
            if (!didSwap) {
                break;
            }
        }
        return nums;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSortSolution solution = new BubbleSortSolution();
        int[] nums = {7, 4, 1, 5, 3};

        System.out.println("Array Before Using Bubble Sort: " + Arrays.toString(nums));
        nums = solution.bubbleSort(nums);
        System.out.println("Array After Using Bubble Sort: " + Arrays.toString(nums));
    }
}
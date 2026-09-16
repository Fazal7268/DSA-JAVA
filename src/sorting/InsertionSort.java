package sorting;

class InsertionSortSolution {
    public int[] insertionSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
        return nums;
    }
}

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSortSolution solution = new InsertionSortSolution();
        int[] nums = {13, 46, 24, 52, 20, 9};

        System.out.println("Before Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        nums = solution.insertionSort(nums);

        System.out.println("After Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
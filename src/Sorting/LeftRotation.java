class Arr {
    public void reverse(int[] nums , int st , int end){
        while(st<end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            st++;
            end--;
        }
    }
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, k-1);
        reverse(nums, k , n-1);
        reverse(nums , 0 ,n-1);
    }
}

public class LeftRotation {
    public static void printArray(int[] nums) {
        for (int val : nums) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 2;

        System.out.println("Initial array: ");
        printArray(nums);

        // Create an instance of the Solution class
        Arr  sol = new Arr();

        /* Function call to rotate the
        array to the left by k places */
        sol.rotateArray(nums, k);

        System.out.println("Array after rotating elements by " + k + " places: ");
        printArray(nums);
    }
}


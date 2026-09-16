package arrays;

class MoveZeroesSolution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        MoveZeroesSolution sol = new MoveZeroesSolution();
        sol.moveZeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
class Arr1 {
    public void moveZeroes(int[] nums) {
        int j = 0 ;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}

public class Move_Zeros {
    public static void main(String[] args) {
        // Input array
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};

        // Create Solution instance and move zeroes
        Arr1 sol = new Arr1();
        sol.moveZeroes(arr);

        // Print updated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

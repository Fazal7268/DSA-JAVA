class Ar{
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        for(int i = 0; i<nums.length ; i++ ){
            ones = (ones^nums[i]) & (~twos) ;
            twos = (twos^nums[i]) & (~ones) ;
        }return ones;
    }
}

public class Single_II {
    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 0, 1, 1, 3, 3, 10, 0};

        // Creating an instance of Solution class
        Ar sol = new Ar();

        // Function call to find the number that appears only once
        int ans = sol.singleNumber(nums);

        System.out.println("The single number(II) is: " + ans);
    }
}

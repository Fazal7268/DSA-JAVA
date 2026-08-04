
class M0 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int num:nums){
            sum2+=num;
        }
        return sum1-sum2;
    }
}
public class MISSING_0 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 0};

        // Create an instance of the Solution class
        M0 solution = new M0();

        /* Call the missingNumber method
        to find the missing number*/
        int ans = solution.missingNumber(nums);

        System.out.println("The missing number is: " + ans);
    }
}



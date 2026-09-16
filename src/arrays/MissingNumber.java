package arrays;

class MissingNumberSolution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for (int num : nums) {
            sum2 += num;
        }
        return sum1 - sum2;
    }
}

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 0};

        MissingNumberSolution solution = new MissingNumberSolution();
        int ans = solution.missingNumber(nums);

        System.out.println("The missing number is: " + ans);
    }
}
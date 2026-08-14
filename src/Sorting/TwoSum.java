import java.util.*;
class A {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int [][] i = new int[n][2];
        for(int j = 0 ; j<n ; j++){
            i[j][0] = nums[j];
            i[j][1] = j;
        }
        Arrays.sort(i, new Comparator<int[]>(){
            public int compare(int[] a , int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });
        int left = 0;
        int right = n-1 ;
        while(left<right){
            int sum = i[left][0] + i[right][0];
            if(sum == target){
                ans[0] = i[left][1];
                ans[1] = i[right][1];
                return ans;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        } return new int[]{-1,-1};

    }
}

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 8, 11};
        int target = 14;

        // Create an instance of Solution class
        A sol = new A();

        int[] ans = sol.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers that sum up to " + target + " are: [" + ans[0] + ", " + ans[1] + "]");
    }
}

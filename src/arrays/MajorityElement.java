package arrays;

class MajorityElementSolution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int c = 0;
        int el = 0;
        for (int i = 0; i < n; i++) {
            if (c == 0) {
                c = 1;
                el = nums[i];
            } else if (el == nums[i]) {
                c++;
            } else {
                c--;
            }
        }
        int c1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) {
                c1++;
            }
        }
        if (c1 > n / 2) {
            return el;
        }
        return -1;
    }
}

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};

        MajorityElementSolution sol = new MajorityElementSolution();
        int ans = sol.majorityElement(arr);

        System.out.println("The majority element is: " + ans);
    }
}
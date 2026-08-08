import java.util.*;

class CH {
    public boolean isSorted(ArrayList<Integer> nums) {
        int i = 0;
        int left = 0;
        int right = 1;
        boolean sort = true;
        if (nums.size() < 1) {
            sort = true;
        } else {
            while (i < nums.size() - 1) {
                if (nums.get(left) > nums.get(right)) {
                    sort = false;
                    break;
                } else {
                    sort = true;
                }
                left++;
                right++;
                i++;
            }
        }return sort;
    }
}

public class Q_S {
    public static void main(String[] args) {
        CH solution = new CH();
        ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        boolean result = solution.isSorted(nums);
        System.out.println(result ? "Array is sorted" : "Array is not sorted");
    }

}

import java.util.*;
class Helper{
    public List<Integer> Leaders(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    if(nums.length == 0){
        return ans;
    }
    int max = nums[nums.length-1];
    ans.add(max);
    for(int i = nums.length-2;i>=0;i--){
        if(nums[i]>max){
            ans.add(nums[i]);
            max = nums[i];
        }
    }
    Collections.reverse(ans);
    return ans;
}
}
public class Leaders_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRRAY:");
        for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }
        Helper helper = new Helper();
        List<Integer> result = helper.Leaders(arr);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}
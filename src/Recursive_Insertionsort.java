class Sol {
    public int[] insertionSort(int[] nums) {
        insert(nums,nums.length);
        return nums;
    }
    public void insert(int[] nums , int n){
        if(n<=1){
            return;
        }
        insert(nums,n-1);
        int last = nums[n-1];
        int j = n-2;
        while (j>=0&& nums[j]>last){
            nums[j+1] = nums[j];
            j--;
        }nums[j+1] = last;
    }
}
public class Recursive_Insertionsort {
    public static void main(String[] args) {
        Sol sol = new Sol();
        int[] nums = {5,2,9,1,5,6};
        sol.insertionSort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }

    }
}

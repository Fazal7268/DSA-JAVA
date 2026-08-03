import java.util.*;
class Array {
    public int[] unionArray(int[] nums1, int[] nums2) {
        List<Integer> Union = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                if(Union.isEmpty()||Union.get(Union.size()-1)!=nums1[i]){
                    Union.add(nums1[i]);
                }i++;
            }
            else{
                if(Union.isEmpty()||Union.get(Union.size()-1)!=nums2[j]){
                    Union.add(nums2[j]);
                }j++;
            }
        } while(i<n1){
            if(Union.isEmpty()||Union.get(Union.size()-1)!=nums1[i]){
                Union.add(nums1[i]);
            }i++;
        }while(j<n2){
            if(Union.isEmpty()||Union.get(Union.size()-1)!=nums2[j]){
                Union.add(nums2[j]);
            }j++;
        }
        int [] Un = new int[Union.size()];
        for(int k = 0 ; k<Union.size() ; k++ ){
            Un[k] = Union.get(k);
        }return Un;
    }
}

public class Union_arrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] nums2 = {2, 3, 4, 4, 5, 11, 12};

        // Create an instance of the Solution class
        Array finder = new Array();

        // Get union of nums1 and nums2 using class method
        int[] Union = finder.unionArray(nums1, nums2);

        // Output the result
        System.out.println("Union of nums1 and nums2 is:");
        for (int val : Union) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}

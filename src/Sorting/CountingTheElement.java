import java.util.*;
class Hash {
    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: freq.entrySet()){
            ans.add(Arrays.asList(entry.getKey(),entry.getValue()));
        }return ans;

    }
}
class CountingTheElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3, 4};  // Example input array

        Hash sol = new Hash();
        List<List<Integer>> result = sol.countFrequencies(nums);
        for (List<Integer> pair : result) {
            System.out.println("Element: " + pair.get(0) + ", Frequency: " + pair.get(1));
        }
    }
}


package hashing;

import java.util.*;

class HighestFrequencyElementSolution {
    public int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int maxfreq = 0;
        int maxelement = 0;
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (freq.get(num) > maxfreq) {
                maxfreq = freq.get(num);
                maxelement = num;
            } else if (freq.get(num) == maxfreq) {
                maxelement = Math.min(num, maxelement);
            }
        }
        return maxelement;
    }
}

public class HighestFrequencyElement {
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6};

        HighestFrequencyElementSolution sol = new HighestFrequencyElementSolution();
        int ans = sol.mostFrequentElement(nums);

        System.out.println("The highest occurring element in the array is: " + ans);
    }
}
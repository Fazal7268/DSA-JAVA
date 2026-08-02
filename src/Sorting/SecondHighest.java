import java.util.*;
class Hash2 {
    public int secondMostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int maxelement = -1;
        int maxfreq = 0;
        int maxfreq2 = 0;
        int maxelement2 = -1;
        for (int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        } for(int num:nums){
            if(freq.get(num)>maxfreq){
                maxfreq2 = maxfreq;
                maxfreq = freq.get(num) ;
                maxelement2 = maxelement;
                maxelement = num;
            }else if(freq.get(num) == maxfreq){
                maxelement =    Math.min(num,maxelement);
            }else if (freq.get(num) > maxfreq2 && freq.get(num) < maxfreq ){
                maxfreq2 =  freq.get(num);
                maxelement2 = num;
            }
            else if (freq.get(num)==maxfreq2){
                maxelement2 = Math.min(num,maxelement2);
            }
        }return maxelement2;
    }
}



public class SecondHighest {
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7};

        /* Creating an instance of
        Solution class */
        Hash2 sol = new Hash2();

        /* Function call to get the second
        highest occurring element in array */
        int ans = sol.secondMostFrequentElement(nums);

        System.out.println("The second highest occurring element in the array is: " + ans);
    }
}


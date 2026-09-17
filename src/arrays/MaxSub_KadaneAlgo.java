import java.util.*;

public class MaxSub_KadaneAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("ENTER THE ELEMENTS OF THE ARRRAY:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Long max = Long.MIN_VALUE;
        Long Sum = 0L ;
        int start = 0;
        int ansStart = -1 , ansEnd = -1;
        for(int i = 0; i < n; i++) {
            if(Sum==0){
                start = i;
            }
            Sum+=arr[i];
            if(Sum>max){
                max = Sum;
                ansStart = start;
                ansEnd = i;
            }
            if(Sum<0){
                Sum = 0L;
            }

        }
        System.out.println("The maximum Sum Kadane Algo is:" + max);
        System.out.println("The maximum Sum Sub Array Kadane Algo is:");
        for(int i = ansStart ; i<=ansEnd ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}


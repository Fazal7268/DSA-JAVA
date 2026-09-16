package math;

import java.util.ArrayList;

class DivisorsSolution {
    public int[] divisors(int n) {
        ArrayList<Integer> smallDivisors = new ArrayList<>();
        ArrayList<Integer> largeDivisors = new ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                smallDivisors.add(i);
                if (i != n / i) {
                    largeDivisors.add(n / i);
                }
            }
        }

        for (int i = largeDivisors.size() - 1; i >= 0; i--) {
            smallDivisors.add(largeDivisors.get(i));
        }

        int[] result = new int[smallDivisors.size()];
        for (int i = 0; i < smallDivisors.size(); i++) {
            result[i] = smallDivisors.get(i);
        }

        return result;
    }
}

public class DivisorsOfNumber {
    public static void main(String[] args) {
        int n = 6;

        DivisorsSolution sol = new DivisorsSolution();
        int[] ans = sol.divisors(n);

        System.out.print("The divisors of " + n + " are: ");
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
import java.util.*;

class S1 {
    // Function to find all divisors of n
    public int[] divisors(int n) {
        // Stores smaller divisors in increasing order
        ArrayList<Integer> smallDivisors = new ArrayList<>();

        // Stores larger paired divisors in decreasing order
        ArrayList<Integer> largeDivisors = new ArrayList<>();

        // Check numbers only up to the square root of n
        for (int i = 1; i * i <= n; i++) {
            // If i divides n completely, it is a divisor
            if (n % i == 0) {
                smallDivisors.add(i);

                // Add the paired divisor only if it is different
                if (i != n / i) {
                    largeDivisors.add(n / i);
                }
            }
        }

        // Add larger divisors in reverse order to maintain sorted order
        for (int i = largeDivisors.size() - 1; i >= 0; i--) {
            smallDivisors.add(largeDivisors.get(i));
        }

        // Create the final answer array
        int[] result = new int[smallDivisors.size()];

        // Copy all divisors from list to array
        for (int i = 0; i < smallDivisors.size(); i++) {
            result[i] = smallDivisors.get(i);
        }

        // Return the sorted divisors
        return result;
    }
}

class all_div  {
    public static void main(String[] args) {
        int n = 6;

        // Creating an instance of Solution class
        S1 sol = new S1();

        // Function call to find all divisors of n
        int[] ans = sol.divisors(n);

        System.out.print("The divisors of " + n + " are: ");
        for(int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}



package math;

class GCDSolution {
    public int gcd(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if (n1 == 0) return n2;
        return n1;
    }
}

public class GCD {
    public static void main(String[] args) {
        int n1 = 4, n2 = 6;

        GCDSolution sol = new GCDSolution();
        int ans = sol.gcd(n1, n2);

        System.out.println("GCD of " + n1 + " and " + n2 + " is: " + ans);
    }
}
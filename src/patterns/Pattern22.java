package patterns;

class Pattern22Solution {
    public void pattern22(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int down = 2 * (n - 1) - i;
                int right = 2 * (n - 1) - j;
                System.out.print(n - Math.min(Math.min(top, down), Math.min(left, right)));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

public class Pattern22 {
    public static void main(String[] args) {
        int n = 5;

        Pattern22Solution sol = new Pattern22Solution();
        sol.pattern22(n);
    }
}